package TestAutomation.Pratice2;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPagetest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test(dataProvider = "getData")
	public void doLogin(String Username, String Password, String text) throws IOException, InterruptedException {
		driver = initializeDriver();
		log.trace("start loginpagetest");
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		LoginPage lp1 = new LoginPage(driver);
		lp1.getUsername().sendKeys(Username);
		System.out.println("ID");
		log.trace("username done");
		lp1.getPassword().sendKeys(Password);
		System.out.println("pass");
		log.trace("password done");
		lp1.loginbutton().click();
		log.trace("closing loginpagetest");
		driver.close();
	}

	@DataProvider
	public Object[][] getData() {
		// Row stands for how many different data types test should run
		// coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data = new Object[2][3];
		// 0th row
		data[0][0] = "123456879@mailinator.com";
		data[0][1] = "Test@123";
		data[0][2] = "Non Restrcited User";
		// 1st row
		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "456788";
		data[1][2] = "Restrcited User";

		return data;

	}
}
