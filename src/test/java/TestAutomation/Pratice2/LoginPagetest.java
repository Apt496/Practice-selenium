package TestAutomation.Pratice2;
import java.io.IOException;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class LoginPagetest extends Base{


@Test
public void doLogin() throws IOException, InterruptedException {
	driver = initializeDriver();
	driver.get("http://automationpractice.com/index.php");
	
	LandingPage lp = new LandingPage(driver);
	lp.getLogin().click();

	LoginPage lp1 = new LoginPage(driver);
	lp1.getUsername().sendKeys("123456879@mailinator.com");
	System.out.println("iD");
	lp1.getPassword().sendKeys("Test@123");
	System.out.println("pass");
	lp1.loginbutton().click();
	//driver.findelkement
	driver.close();
	


}
}
