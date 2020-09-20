package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LandingPage extends Base {

	public WebDriver driver;

	By signin = By.xpath("//a[@class='login']");

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement getLogin() {

		return driver.findElement(signin);
	}

}
