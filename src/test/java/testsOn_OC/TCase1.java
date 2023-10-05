package testsOn_OC;

import org.testng.annotations.Test;

import ocBase.Base;
import ocPageEvents.HomePageEvents;
import ocPageEvents.LoginPageEvents;
import ocPageEvents.RegistrationPageEvents;
import ocUtilities.ElementFetch;

public class TCase1 extends Base {
	ElementFetch ef = new ElementFetch();
	HomePageEvents hp = new HomePageEvents();
	LoginPageEvents lp = new LoginPageEvents();
	RegistrationPageEvents rp = new RegistrationPageEvents();

	@Test
	public void LoginToOC() {
		hp.GotoLoginPage();
		lp.varifyIfLoginPageIsLoaded();
		lp.EnterCredentialsAndLogin();
	}

	@Test
	public void Registration() {
		hp.GoToRegistrationPage();
		rp.EnterRegistrationCredentials();
		}
}
