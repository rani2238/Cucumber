package practiecs;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
    public WebDriver driver;
    public Properties p;
    public Logger logger;
    @BeforeClass
    @Parameters({"browser"})
	public void setup(String br) throws IOException {
    	FileReader file=new FileReader("./src//main//resources//config.properties");
    	p=new Properties();
    	p.load(file);
    	logger=LogManager.getLogger(this.getClass());
    	switch(br.toLowerCase()) {
    	case "chrome":    	driver = new ChromeDriver(); break; 
    	case "edge":    	driver = new EdgeDriver() ;break;
    	case "firefox":    	driver = new FirefoxDriver() ;break;
    	default:System.out.println("inavlid browser name");return;    	
    	}
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get(p.getProperty("appURL"));
    	driver.manage().window().maximize();
    	   	
    }
    @AfterClass
    public void teardown() {
    	driver.quit();
    }
    @DataProvider(name="rani")
    String[][] logindata(){
    	String data[][]= {
    			{"appURL","appURL"},
    			
    	};
    	return data;
    }
}
