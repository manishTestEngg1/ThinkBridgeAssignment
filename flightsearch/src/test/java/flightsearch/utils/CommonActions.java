package flightsearch.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {

	WebDriver driver;

	public CommonActions(WebDriver driver) {
		this.driver = driver;
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void enterData(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void sendKeys(WebElement element)
	{
		element.sendKeys(Keys.DOWN);
//		element.sendKeys(Keys.ENTER);
	}

	public static String getText(WebElement element) {
		return element.getText();
	}
}
