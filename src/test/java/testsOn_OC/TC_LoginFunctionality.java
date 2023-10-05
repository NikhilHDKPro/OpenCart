 package testsOn_OC;

import org.testng.annotations.Test;

import ocBase.Base;
import ocPageEvents.HomePageEvents;
import ocPageEvents.LoginPageEvents;
import ocUtilities.ElementFetch;

public class TC_LoginFunctionality extends Base{
ElementFetch ef=new ElementFetch();
HomePageEvents hp=new HomePageEvents();
LoginPageEvents lp=new LoginPageEvents();
	
	@Test
  public void MethodA() {
	  hp.GotoLoginPage();
//	  lp.varifyIfLoginPageIsLoaded();
	  lp.EnterCredentialsAndLogin();
  }
}
