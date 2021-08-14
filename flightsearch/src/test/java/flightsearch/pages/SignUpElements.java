package flightsearch.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author manish In This Class We have all the SignOff WebElement and it
 *         methodElements
 */
public class SignUpElements {

	public SignUpElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//span[@aria-label='Select box activate'])[2]"))
	private WebElement dropdwon;

	@FindBy(xpath = ("//*[@id=\"language\"]/ul"))
	private WebElement dropDownValues;

	@FindBy(xpath = "//div[@id='language']/ul/li/div[4]/a/div")
	private WebElement dropDownDutch;

	@FindBy(id = "name")
	private WebElement fullName;

	@FindBy(id = "orgName")
	private WebElement orgName;

	@FindBy(id = "singUpEmail")
	private WebElement email;

	@FindBy(xpath = "//span[text()='I agree to the']")
	private WebElement agreeTermsCondition;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//span[contains(text(),'A welcome email has been sent')]")
	private WebElement confirmation;

	public WebElement getDropdwon() {
		return dropdwon;
	}

	public WebElement getDropDownValues() {
		return dropDownValues;
	}

	public WebElement getDropDownDutch() {
		return dropDownDutch;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAgreeTermsCondition() {
		return agreeTermsCondition;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getConfurmation() {
		return confirmation;
	}

}
