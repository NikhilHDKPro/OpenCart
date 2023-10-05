package ocPageEvents;

import org.testng.Assert;

import ocPageObjects.OC_LoginPageElements;
import ocUtilities.Constants;
import ocUtilities.ElementFetch;

public class LoginPageEvents {

	ElementFetch ef=new ElementFetch();
	
	public void varifyIfLoginPageIsLoaded() {
		
	Assert.assertTrue(ef.getWebElements("XPATH", OC_LoginPageElements.LP_LoginButton).size()>0,"Element not found");	
	} 
	
	public void EnterCredentialsAndLogin() {
		ef.getWebElement("XPATH", OC_LoginPageElements.LP_EmailAddress).sendKeys(Constants.UserID);
		ef.getWebElement("XPATH", OC_LoginPageElements.LP_Password).sendKeys(Constants.Password); 
		ef.getWebElement("XPATH", OC_LoginPageElements.LP_LoginButton).click();
		
	}
	public void verifyLogin() {
		
	}
	
}
