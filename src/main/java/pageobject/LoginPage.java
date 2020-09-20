package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class LoginPage extends Base {

	public WebDriver driver;

	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By loginbutton = By.xpath("//p[@class='submit']//span[1]");
	By name = By.xpath("//span[contains(text(),'Jon Snow')]");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getUsername() {

		return driver.findElement(username);

	}

	public WebElement getPassword() {

		return driver.findElement(password);

	}

	public WebElement loginbutton() {

		return driver.findElement(loginbutton);

	}

	public WebElement name() {

		return driver.findElement(name);

	}
}
