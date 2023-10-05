package ocPageObjects;

public interface OC_PurchaseAGiftCertificatePageElements {
	
	String PGC_RecipientsName="//input[@id='input-to-name']";
	String PGC_RecipientsEmail="//input[@id='input-to-email']";
	String PGC_YourName="//input[@id='input-from-name']";
	String PGC_YourEmail="//input[@id='input-from-email']";
	String PGC_Birthday="//input[@value='7']";
	String PGC_Christmas="//input[@value='6']";
	String PGC_General="//input[@value='8']";
	String PGC_Message="//textarea[@id='input-message']";
	String PGC_Amount="//input[@id='input-amount']";
	String PGC_NonRefundableCheckBox="//input[@name='agree']";
	String PGC_ContinueButton="//input[@name='agree']";

}
