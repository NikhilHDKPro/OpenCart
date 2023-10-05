package ocPageObjects;

public interface OC_RegistrationPageElements {

	String RegPLogInPageLink="//a[normalize-space()='login page']";
	String RegPFirstName="//input[@id='input-firstname']";
	String RegPLastName="//input[@id='input-lastname']";
	String RegPEmail="//input[@id='input-email']";
	String RegPTelephone="//input[@id='input-telephone']";
	String RegPPassword="//input[@id='input-password']";
	String RegPPasswordConfirm="//input[@id='input-confirm']";
	String RegPSubscribeYes="//label[normalize-space()='Yes']//input[@name='newsletter']";
	String RegPSubscribeNo="//input[@value='0']";
	String RegPPrivaccyPolicy="//b[normalize-space()='Privacy Policy']";
	String RegPPrivacyPolicyCheckBox="//input[@name='agree']";
	String RegPContinueButton="//input[@value='Continue']";
	
}
