package flightsearch.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import flightsearch.base.BaseClass;
import flightsearch.pages.SignUpElements;
import flightsearch.utils.CommonActions;

/**
 * @author manish
 *
 */
public class ValidateSignOffDropdownTest extends BaseClass {
	SignUpElements element;
	SoftAssert softAssert;

	@Test(priority = 1)
	public void testEnglishDropdown() {
		element = new SignUpElements(BaseClass.getDriver());
		softAssert = new SoftAssert();

		String englishOption = CommonActions.getText(element.getDropdwon());
		System.out.println("First Option Value: " + englishOption);
		softAssert.assertEquals(englishOption, "English");

		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void testDutchDropdown() throws InterruptedException {
		CommonActions.click(element.getDropdwon());
		String dutchOption = CommonActions.getText(element.getDropDownDutch());
		System.out.println("Second Option Value is : " + dutchOption);
		softAssert.assertEquals(dutchOption, "Dutch");

		softAssert.assertAll();
	}
	
}
