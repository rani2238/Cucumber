package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelldata {
  public static void main(String[] args) throws IOException, InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.navigate().to("https://testautomationpractice.blogspot.com/");
	   driver.manage().window().maximize();
	   WebElement slider=driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
      JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].scrollIntoView();",slider);
       System.out.println(js.executeScript("return window.pageYOffset;"));
  
  
  }
}
