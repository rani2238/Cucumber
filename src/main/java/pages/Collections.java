package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practiecs.Baseclass;

public class Collections extends Baseclass{
	public WebDriver driver;
     public Collections(WebDriver driver) {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
     }
     @FindBy(xpath="//span[text()=\"Collections\"]")WebElement collection;
     @FindBy(xpath="//span[text()=\"Denims\"]")WebElement denims;
     public void setcollection() {
    	 collection.click();
     }
     public void setdenims() {
    	 denims.click();
     }

}
