package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practiecs.Baseclass;

public class Homepage extends Baseclass{
	
   public WebDriver driver;
   public Homepage(WebDriver driver) {
	   this.driver=driver;	
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//span[text()=\"My Account\"]") WebElement myaccount;
   @FindBy(xpath="//a[normalize-space()=\"Register\"]") WebElement reg;
   @FindBy(xpath="//a[normalize-space()=\"Login\"]") WebElement login;
   public void clickonaccount() {
	   myaccount.click();
   }
   public void registration() {
	   reg.click();
   }
   public void login() {
	   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	   login.click();
	   System.out.println("clicked on login");
   }

   
}
