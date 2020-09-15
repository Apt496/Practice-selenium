package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Base {
	public static WebDriver driver;

	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		{

			Properties prop = new Properties();
			// System.getProperty("user.dir")
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

			prop.load(fis);
			String browserName = prop.getProperty("browser");
			System.out.println(browserName);
			
			if(browserName.contains("chrome")){
				//normal way to call browser 
				//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				//driver = new FirefoxDriver();	
				
			}
			else if (browserName.contains("edge")) {
			//normal way to call browser 
			//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			//driver = new FirefoxDriver();
			// driver manager to call browser use one comment the other way
			
		}
			else if (browserName.contains("firefox")) {
				//normal way to call browser 
				System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://automationpractice.com/index.php");
			
		
		return driver;
			}
	}
}
