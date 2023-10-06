package ocPageEvents;

import org.testng.Assert;
import ocBase.Base;
import ocPageObjects.OC_LoginPageElements;
import ocUtilities.Constants;
import ocUtilities.ElementFetch;

public class LoginPageEvents extends Base {

	ElementFetch ef = new ElementFetch();

	public void varifyIfLoginPageIsLoaded() {

		Assert.assertTrue(ef.getWebElements("xpath", OC_LoginPageElements.LP_LoginButton).size() > 0,
				"Element not found");
	}

	public void EnterCredentialsAndLogin() {

		ef.getWebElement("xpath", OC_LoginPageElements.LP_EmailAddress).sendKeys(Constants.UserID);
		ef.getWebElement("xpath", OC_LoginPageElements.LP_Password).sendKeys(Constants.Password);
		ef.getWebElement("xpath", OC_LoginPageElements.LP_LoginButton).click();

	}

}
