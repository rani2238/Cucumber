package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practiecs.Baseclass;

public class Registrationpage extends Baseclass {
 public WebDriver driver;
 public Registrationpage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
    @FindBy(xpath="//input[@id=\"input-firstname\"]")WebElement frstname;
    @FindBy(xpath="//input[@id=\"input-lastname\"]")WebElement lastname;
    @FindBy(xpath="//input[@id=\"input-email\"]")WebElement remail;
    @FindBy(xpath="//input[@id=\"input-telephone\"]")WebElement phn;
    @FindBy(xpath="//input[@id=\"input-password\"]")WebElement rpwd;
    @FindBy(xpath="//input[@id=\"input-confirm\"]")WebElement cpwd;
    @FindBy(xpath="//input[@type=\"submit\"]")WebElement rbutton;
    public void setfrstname(String fname) {
    	frstname.sendKeys(fname);
    }
    public void setlastname(String lname) {
    	lastname.sendKeys(lname);
    }
    public void setemail(String mail) {
    	remail.sendKeys(mail);
    }
    public void setphn(String phone) {
    	phn.sendKeys(phone);
    }
    public void setrpassword(String rpassword) {
    	rpwd.sendKeys(rpassword);
    }
    public void setconfirmpassword(String cnfrmpwd) {
    	cpwd.sendKeys(cnfrmpwd);
    }
    public void setbtn() {
    	rbutton.click();
    }


}
