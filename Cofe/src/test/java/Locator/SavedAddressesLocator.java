package Locator;

import org.openqa.selenium.By;

public class SavedAddressesLocator {

	public By savedAddressesLink=By.xpath("//p[text()='My Account']/parent::div//p[text()='Saved Addresses']");
	
	public By savedAddressesHeading=By.xpath("//h3[text()='Saved Addresses']");
	
	public By addAddressForm=By.xpath("//button[text()='Add Address']");
	
	public By firstNameField=By.id("firstName");
	
	public By lastNameField=By.id("lastName");
	
	public By addressPOBoxField=By.xpath("//input[@placeholder='Address /PO Box *']");
	
	public By addressSuggestionList=By.xpath("//input[@placeholder='Address /PO Box *']/parent::div//div//p");
	
	public By phoneNumberField=By.id("phone");
	
	public By addAddressButton=By.xpath("//div[@role='group']//button[text()='Add Address']");
	
	public By addressCancelButton=By.xpath("//div[@role='group']//button[text()='Cancel']");
	
	public By addressAddedSucessMessage=By.xpath("//div[text()='Your Address has been successfully added.']");
	
	public By editButton=By.xpath("//button[text()='Edit']");
	
	
}
