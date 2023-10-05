package ocPageEvents;


import java.util.UUID;

import ocPageObjects.OC_RegistrationPageElements;
import ocUtilities.Constants;
import ocUtilities.ElementFetch;

public class RegistrationPageEvents {
ElementFetch ef=new ElementFetch();

	public void EnterRegistrationCredentials()
	{
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPFirstName).sendKeys(Constants.FirstName);
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPLastName).sendKeys(Constants.LastName);
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPEmail).sendKeys(generateUniqueEmail());
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPTelephone).sendKeys(Constants.Telephone);
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPPassword).sendKeys(Constants.Password);
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPPasswordConfirm).sendKeys(Constants.PasswordConfirm);
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPSubscribeYes).click();
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPPrivacyPolicyCheckBox).click();
		ef.getWebElement("xpath", OC_RegistrationPageElements.RegPContinueButton).click();
	}
	public String generateUniqueEmail() {
	    String uuid = UUID.randomUUID().toString(); // Generate a random UUID
	    return "testuser_" + uuid + "@example.com"; // Modify the domain as needed
	}

	

}
