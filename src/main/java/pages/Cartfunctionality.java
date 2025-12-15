package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import practiecs.Baseclass;

public class Cartfunctionality extends Baseclass{
	public WebDriver driver;
	public Cartfunctionality(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()=\"All Categories\"]" ) WebElement categories;
	@FindBy(xpath="//img[@alt=\"Chocolates\"]" ) WebElement chocolates;
	@FindBy(xpath="//img[@alt=\"Sweetbuds\"]" ) WebElement sweetbuds;
	@FindBy(xpath="//img[@id=\"pimg_EF_PC_CHOC0V571POD00147\"]" ) WebElement kitkat;
	@FindBy(xpath="//button[@id=\"addtocartbutton\"]" ) WebElement cart;
	@FindBy(xpath="//a[text()=\"View Cart\"]" ) WebElement view;
	public void setcategories() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(categories)).click();
		
	}
	public void setchocolates() {
		chocolates.click();
	}
	public void setsweetbuds() {
		sweetbuds.click();
	}
	public void setkitkat() {
		kitkat.click();
	}
	public void clickcart() {
		cart.click();
	}
	public void clickview() {
		view.click();
	}
	



}
