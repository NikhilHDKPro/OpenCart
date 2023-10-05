package ocUtilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ocBase.Base;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String identifierValue) {
		switch(identifierType) {
		case "XPATH":
			return Base.driver.findElement(By.xpath(identifierValue));
		case "CSS":
			return Base.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return Base.driver.findElement(By.id(identifierValue));
		case "NAME":
			return Base.driver.findElement(By.name(identifierValue));
		case "TAGNAME":
			return Base.driver.findElement(By.tagName(identifierValue));
		
		default:
		return null;
	}
	}
	public List<WebElement> getWebElements(String identifierType, String identifierValue){
		switch(identifierType) {
		case "XPATH":
			return Base.driver.findElements(By.xpath(identifierValue));
		case "CSS":
			return Base.driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return Base.driver.findElements(By.id(identifierValue));
		case "NAME":
			return Base.driver.findElements(By.name(identifierValue));
		case "TAGNAME":
			return Base.driver.findElements(By.tagName(identifierValue));
		
		default:
		return null;
		
		}
	}}
