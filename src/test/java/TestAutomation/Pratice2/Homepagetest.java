package TestAutomation.Pratice2;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;

public class Homepagetest extends Base {
	@Test

	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		driver.close();

	}
}
