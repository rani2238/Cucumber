package tests;


import org.testng.annotations.Test;

import pages.Homepage;
import pages.Registrationpage;
import practiecs.Baseclass;

public class Test_002registration extends Baseclass{
	@Test
	public void regusrtation() {
		Homepage hp=new Homepage(driver);
		hp.clickonaccount();
		logger.info("clcikced on myaccount");

		hp.registration();
		logger.info("clicked on registartion");

		

		Registrationpage rp=new Registrationpage(driver);
		logger.info("entering information of user");
		rp.setfrstname(p.getProperty("Name"));
		rp.setlastname(p.getProperty("lastname"));
		rp.setemail(p.getProperty("email"));
		rp.setphn(p.getProperty("phone"));
		rp.setrpassword(p.getProperty("password"));
		logger.info("password set");
		rp.setconfirmpassword(p.getProperty("confirmpassword"));
		rp.setbtn();
		
	}

}
