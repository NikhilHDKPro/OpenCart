package ocPageObjects;

public interface OC_AddAdressPageElements {

	String NA_FirstName="//input[@id='input-firstname']";
	String NA_LastName="//input[@id='input-lastname']";
	String NA_Comapany="//input[@id='input-company']";
	String NA_Adress1="//input[@id='input-address-1']";
	String NA_Adress2="//input[@id='input-address-2']";
	String NA_City="//input[@id='input-city']";
	String NA_PostCode="//input[@id='input-postcode']";
	String NA_Country="//select[@id='input-country']";
	String NA_RegionState="//select[@id='input-zone']";
	String NA_DefaultAdressYes="//input[@value='1']";
	String NA_DefaultAdressNo="//input[@value='0']";
	String NA_BackButton="//a[@class='btn btn-default']";
	String NA_ContinueButton="//input[@value='Continue']";
}
