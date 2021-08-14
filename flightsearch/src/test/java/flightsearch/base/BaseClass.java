package flightsearch.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import flightsearch.utils.ConfigReader;

/**
 * @author manish This class is used for Open the browser with given url which
 *         is read from configuration file
 */
public class BaseClass {
	static WebDriver driver;
	ConfigReader configReader = new ConfigReader();

	/**
	 * @param browser
	 */
	@Parameters({ "browser" })
	@BeforeMethod
	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get(configReader.getUrl());
	}

	public static WebDriver getDriver() {
		return driver;
	}

//	@AfterSuite
//	public void tearDown() {
//		driver.close();
//	}
}
