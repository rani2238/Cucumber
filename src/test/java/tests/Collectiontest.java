package tests;

import org.testng.annotations.Test;

import pages.Collections;
import practiecs.Baseclass;

public class Collectiontest extends Baseclass{
	@Test
	public void collection() {
		Collections collect=new Collections(driver);
		collect.setcollection();
		collect.setdenims();
	}

}
