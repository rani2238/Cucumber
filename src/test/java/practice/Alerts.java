package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Alerts {
   public static void main(String[] args) throws IOException {
	   WebDriver driver=new ChromeDriver();
	   	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.kapruka.com/");
	   	   driver.manage().window().maximize();
	   	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   	   System.out.println(links.size());
	   	   for(WebElement link:links) {
	   		   String hrefvalue=link.getAttribute("href");
	   		   if(hrefvalue==null) {
	   			   System.out.println("not possible");
	   			   continue;
	   		   }
	   		   URL linkurl=new URL(hrefvalue);
	   		   HttpURLConnection conn= (HttpURLConnection)linkurl.openConnection();
	   		   if(conn.getResponseCode()>=400) {
	   			   System.out.println("broken link");
	   		   }else {
	   			   System.out.println("not broken link");
	   		   }
	   	   }
	   	   
	   	   
	   	   
   }}
