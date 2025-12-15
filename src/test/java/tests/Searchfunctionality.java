package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Searchoption;
import practiecs.Baseclass;

public class Searchfunctionality extends Baseclass{
	@Test
	public void searching() {
		Searchoption sp=new Searchoption(driver);
		sp.searchfunction();
		
	}
	
		

	

}
