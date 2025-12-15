package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchoption {
	 public WebDriver driver;
	 public Searchoption(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(id="search-input") WebElement search;
	 public void searchfunction() {
		 search.sendKeys("dresses");
	 }

}
