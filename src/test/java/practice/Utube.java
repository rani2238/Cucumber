package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utube {
public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//button[@class=\"a-button-text\"]")).click();

	  WebElement account= driver.findElement(By.xpath("//div[@id=\"nav-link-accountList\"]"));
	  WebElement signin= driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]"));

	  Actions act=new Actions(driver);
	  act.moveToElement(account).perform();
	  act.moveToElement(signin).perform();
}}