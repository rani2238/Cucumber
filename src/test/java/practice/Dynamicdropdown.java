package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicdropdown {
public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.com/?zx=1764385712747&no_sw_cr=1");
	   	   driver.manage().window().maximize();
	   	   driver.findElement(By.name("q")).sendKeys("selenium ");
	   	   List<WebElement> search=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	   	   
	   	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)) ;
	   	 //List<WebElement> options=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@aria-label=\"selenium webdriver\"]")));
	   	for(WebElement op:search) {
	   		if(op.getText().equals("selenium webdriver"));
	   		op.click();
	   		break;
	   	}
			

}
}
