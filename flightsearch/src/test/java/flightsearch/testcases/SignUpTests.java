package flightsearch.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import flightsearch.base.BaseClass;
import flightsearch.pages.SignUpElements;
import flightsearch.utils.CommonActions;

public class SignUpTests extends BaseClass {
	SignUpElements element;
	SoftAssert softAssert;

	@Test(priority = 1)
	public void signOffTest() {
		element = new SignUpElements(BaseClass.getDriver());
		softAssert = new SoftAssert();
		CommonActions.enterData(element.getFullName(), "Manish Kushwaha");
		CommonActions.enterData(element.getOrgName(), "nmc");
		CommonActions.enterData(element.getEmail(), "manishkushwaha246@gmail.com");
		CommonActions.click(element.getAgreeTermsCondition());
		CommonActions.click(element.getSubmit());

		String confirmationMessage = CommonActions.getText(element.getConfurmation());
		System.out.println("confirmation:  " + confirmationMessage);
		softAssert.assertEquals(confirmationMessage, "A welcome email has been sent. Please check your email.");
		softAssert.assertAll();
	}

	/**
	 * @return String[][] Note : When we are doing SignOff REgistration for multiple
	 *         user then we can user Data Provider
	 */
	@DataProvider
	public String[][] getData() {
		String[][] data = null;
		return data;
	}

}
