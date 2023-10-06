package ocPageEvents;

import ocBase.Base;
import ocPageObjects.OC_HomePageElements;
import ocUtilities.ElementFetch;

public class HomePageEvents extends Base {

	ElementFetch ef = new ElementFetch();

	public void GotoLoginPage() {

		ef.getWebElement("xpath", OC_HomePageElements.HP_MyAccountButton).click();
		ef.getWebElement("xpath", OC_HomePageElements.HP_LogInButton).click();

	}

	public void GoToRegistrationPage() {
		ef.getWebElement("xpath", OC_HomePageElements.HP_MyAccountButton).click();
		ef.getWebElement("xpath", OC_HomePageElements.HP_RegistrationButton).click();
	}
}
