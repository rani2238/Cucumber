package practice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolling {
	public static void main(String[] args) throws IOException  {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.amazon.in/");
   driver.manage().window().maximize();
  List<WebElement> links= driver.findElements(By.tagName("a"));
  System.out.println(links.size());
  for(WebElement link:links) {
	  String hrefvalue=link.getAttribute("href");
	  if(hrefvalue == null || hrefvalue.isEmpty() || 
			  hrefvalue.startsWith("javascript") || 
			  hrefvalue.startsWith("#") || 
		        !hrefvalue.startsWith("http")) {
		  System.out.println("hrefvalue id null");
		  continue;
	  }
	  URL linkurl=new URL(hrefvalue);
	  HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
	  if(conn.getResponseCode()>=400) {
		  System.out.println("broken link");
	  }else {
		  System.out.println("not broken");
	  }
  }
   
   
    
	}
	
	
	
}
