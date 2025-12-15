package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Cartfunctionality;
import practiecs.Baseclass;

public class Carttest extends Baseclass{
     
     @Test
     public void cartfunctionalitytest() {
    	Cartfunctionality cf=new Cartfunctionality(driver) ;
    	cf.setcategories();
    	cf.setchocolates();
    	cf.setsweetbuds();
    	cf.setkitkat();
    	cf.clickcart();
    	cf.clickview();
     }
     
}
