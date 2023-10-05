package ocPageEvents;

import ocPageObjects.OC_HomePageElements;
import ocUtilities.ElementFetch;

public class HomePageEvents {
	
ElementFetch ef=new ElementFetch();	
	public void GotoLoginPage() {
		
		ef.getWebElement("XPATH", OC_HomePageElements.HP_MyAccountButton).click();
		ef.getWebElement("XPATH", OC_HomePageElements.HP_LogInButton).click();
	}

}
