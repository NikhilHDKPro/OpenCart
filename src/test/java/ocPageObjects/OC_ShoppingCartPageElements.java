package ocPageObjects;

public interface OC_ShoppingCartPageElements {

	String SC_Product_1_Image="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]";
	String SC_Product_2_Image="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]/img[1]";
	String SC_Product_3_Image="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]/img[1]";
	String SC_Product_4_Image="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]/img[1]";
	String SC_Product_5_Image="/html[1]/body[1]/div[2]/div[2]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a[1]/img[1]";
	String SC_Product_1_UpdateQuantity="//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]/i[1]";
	String SC_Product_1_RemoveProduct="//tbody/tr[1]/td[4]/div[1]/span[1]/button[2]/i[1]";
	String SC_Product_2_UpdateQuantity="//tbody/tr[2]/td[4]/div[1]/span[1]/button[1]/i[1]";
	String SC_Product_2_RemoveProduct="//tbody/tr[2]/td[4]/div[1]/span[1]/button[2]/i[1]";
	String SC_Product_3_UpdateQuantity="//tbody/tr[3]/td[4]/div[1]/span[1]/button[1]/i[1]";
	String SC_Product_3_RemoveProduct="//tbody/tr[3]/td[4]/div[1]/span[1]/button[2]/i[1]";
	String SC_Product_4_UpdateQuantity="//tbody/tr[4]/td[4]/div[1]/span[1]/button[1]/i[1]";
	String SC_Product_4_RemoveProduct="//tbody/tr[4]/td[4]/div[1]/span[1]/button[2]/i[1]";
	String SC_Product_5_UpdateQuantity="//tbody/tr[5]/td[4]/div[1]/span[1]/button[1]/i[1]";
	String SC_Product_5_RemoveProduct="//tbody/tr[5]/td[4]/div[1]/span[1]/button[2]/i[1]";

	String SC_ContinueShoppingButton="//a[@class='btn btn-default']";
	String SC_CheckOutButton="//a[@class='btn btn-primary']//a[@class='btn btn-primary']";
}
