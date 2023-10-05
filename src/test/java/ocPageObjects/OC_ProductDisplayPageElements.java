package ocPageObjects;

public interface OC_ProductDisplayPageElements {

	String PDP_Image="//img[@title='Samsung SyncMaster 941BW']";
	String PDP_Description="//a[normalize-space()='Description']";
	String PDP_Review="//a[normalize-space()='Reviews (0)']";
	String PDP_WR_FirstName="//input[@id='input-name']";
	String PDP_WR_YoyrReview="//textarea[@id='input-review']";
	String PDP_WR_Rating_1="//input[@value='1']";
	String PDP_WR_Rating_2="//input[@value='2']";
	String PDP_WR_Rating_3="//input[@value='3']";
	String PDP_WR_Rating_4="//input[@value='4']";
	String PDP_WR_Rating_5="//input[@value='5']";
	String PDP_WR_ContinueButton="//button[@id='button-review']";
	String PDP_AddtoWishListButton="//button[@type='button']//i[@class='fa fa-heart']";
	String PDP_ComaprethisProductButton="//i[@class='fa fa-exchange']";
	String PDP_Quantity="//input[@id='input-quantity']";
	String PDP_AddToCartButton="//button[@id='button-cart']";
	String PDP_Reviews="//a[normalize-space()='0 reviews']";
	String PDP_WriteAReview="//a[normalize-space()='0 reviews']";
	
}
