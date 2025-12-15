package practice;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dynamicwebtable {
	public  WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String br) {
		  if(br.equals("Chrome")) {
			  driver=new ChromeDriver();
		  }if(br.equals("Edge")) {
			  driver=new EdgeDriver();
		  }if(br.equals("Firefox")) {
			  driver=new FirefoxDriver();
		  }
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://www.facebook.com/");
		   driver.manage().window().maximize();
	
	}
@Test
public void login() {
       WebElement login=driver.findElement(By.id("email")); 
       WebElement pwd=driver.findElement(By.id("pass"));
       WebElement btn=driver.findElement(By.xpath("//button[@name=\"login\"]"));
       login.sendKeys("kolipakarani0@gmail.com");
       pwd.sendKeys("sirisha@12");
       btn.click();
       

	   	   
	   	   
	   	   
	   	   
}	   	   
}

