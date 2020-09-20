package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static Properties prop;

	public WebDriver initializeDriver() throws IOException {

		{

			Properties prop = new Properties();
			// System.getProperty("user.dir")
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

			prop.load(fis);
			String browserName = prop.getProperty("browser").toLowerCase();
			System.out.println(browserName);
			String url = prop.getProperty("URL");
			System.out.println(url);
			// WebDriverManager way 
			if (browserName.contains("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			} else if (browserName.contains("ie")) {
				WebDriverManager.iedriver().setup();
				;
				driver = new InternetExplorerDriver();

			} else if (browserName.contains("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browserName.contains("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			// Normal way
			/*
			 * if(browserName.contains("chrome")){ //normal way to call browser
			 * //System.setProperty("webdriver.gecko.driver",
			 * "D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe"); //driver = new
			 * FirefoxDriver();
			 * 
			 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 * driver.manage().window().maximize(); driver.get(System.getProperty("URL")); }
			 * else if (browserName.contains("edge")) { //normal way to call browser
			 * System.setProperty("webdriver.edge.driver",
			 * "./geckodriver\\msedgedriver.exe"); driver = new EdgeDriver(); // driver
			 * manager to call browser use one comment the other way
			 * 
			 * } else if (browserName.contains("firefox")) { //normal way to call browser
			 * update gecko driver link System.setProperty("webdriver.gecko.driver",
			 * "./geckodriver\\geckodriver.exe");
			 * 
			 * driver = new FirefoxDriver(); driver.get(url);
			 * 
			 * }}
			 */

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(url);

		}

		return driver;
	}
}
