package tests;


import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import practiecs.Baseclass;

public class Test_001login extends Baseclass{
    @Test
    public void login() {
    	Homepage hp=new Homepage(driver);
		hp.clickonaccount();
		logger.info("clcikced on myaccount");
		Loginpage lp=new Loginpage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setepassword(p.getProperty("password"));
		lp.btnlogin();
    }
}
