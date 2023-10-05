package testsOn_OC;

import org.testng.annotations.Test;

import ocBase.Base;
import ocPageEvents.HomePageEvents;
import ocPageEvents.RegistrationPageEvents;
import ocUtilities.ElementFetch;

public class TC_RegistrationFunctionality extends Base {
	ElementFetch ef = new ElementFetch();
	HomePageEvents hp = new HomePageEvents();
	RegistrationPageEvents rp = new RegistrationPageEvents();

	@Test
	public void Registration() {
		hp.GoToRegistrationPage();
		rp.EnterRegistrationCredentials();
		}
}
