package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.HelperClass;

public class ProfileandPreferencesLocator {

	public By ProfileandPreferencesHeading=By.xpath("//h3[text()='Profile & Preferences']");
	
	public By EditButton=By.xpath("//button[text()='Edit']");
	
	 public By FirstnameField=By.id("firstName");
	 
	 public By LastNamefield=By.id("lastName");
	 
	 public By EmailField=By.id("email");
	 
	 public By BirthdayDropdown=By.xpath("//select[@name='birthdayMonth']");
	 
	 public By CancelButton=By.xpath("//button[text()='Cancel']");
	 
	 public By UpdateInformationButton=By.xpath("//button[text()='Update Information']");
	 
	 public By ChangePasswordButton=By.xpath("//button[text()='Change Password']");
	 
	 public By SuccessToastMessage=By.xpath("//div[text()='Your Personal Information has been successfully updated.']");
	 
}
