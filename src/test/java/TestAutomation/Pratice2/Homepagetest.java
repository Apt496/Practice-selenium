package TestAutomation.Pratice2;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Homepagetest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		log.trace("start homepagetest");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		log.trace("close homepagetest");
		driver.close();

	}
}
