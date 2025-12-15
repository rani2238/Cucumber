package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practiecs.Baseclass;

public class Loginpage extends Baseclass{
    public WebDriver driver;
    public Loginpage(WebDriver driver) {
    	this .driver=driver;
    	PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//input[@id='input-email']") WebElement eml;
    @FindBy(xpath="//input[@id=\"input-password\"]") WebElement pwd;
    @FindBy(xpath="//input[@value=\"Login\"]") WebElement btn;
   public void setemail(String email) {
	   eml.clear();
	   eml.sendKeys(email);
   }
   public void setepassword(String password) {
	   pwd.clear();
	   pwd.sendKeys(password);
   }
   public void btnlogin() {
	   btn.click();	   
   }

   
}
