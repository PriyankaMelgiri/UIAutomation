package Locator;

import org.openqa.selenium.By;

public class PaymentMethodsLocator {
	
	public By paymentMethodsLink=By.xpath("//p[text()='My Account']/parent::div//p[text()='Payment Methods']");
	
	public By editButton=By.xpath("//button[text()='Edit']");
	
	public By cardNameField=By.xpath("//input[@name='cardname']");
	
	public By expireDateField=By.xpath("//input[@placeholder='MM/YY']");
	
	public By updateButton=By.xpath("//button[text()='Update']");
	
	public By cancelButton=By.xpath("//button[text()='Cancel']");
	
	public By setAsDefaultRadioButton=By.xpath("//p[text()='Set as my default card']/parent::span/parent::label/span[@aria-hidden='true']");
	
	public By cardUpdatedSuccessMessage=By.xpath("//div[text()='Card updated.']");
	
	public By deleteButton=By.xpath("//button[text()='Delete']");
	
	public By deleteCardPOPUP=By.xpath("//header[text()='Delete Card']");
	
	public By deleteButtonOnPOPUP=By.xpath("//button[text()='Delete']/parent::footer");
	
	public By cancelButtonOnPOPUP=By.xpath("//button[text()='Cancel']/parent::footer");
	
	public By cardDeletedSuccessMessage=By.xpath("//div[text()='Card deleted.']");

}
