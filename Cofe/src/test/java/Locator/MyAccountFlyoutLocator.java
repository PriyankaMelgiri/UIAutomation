package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.HelperClass;

public class MyAccountFlyoutLocator {

	public By SignInButton=By.xpath("//p[text()='Sign In']");
	
	public By ProfileandPreferences=By.xpath("//p[text()='My Account']/parent::div//a//p[text()='Profile & Preferences']");

	public By orderHistory=By.xpath("//p[text()='My Account']/parent::div//a//p[text()='Order History']");
	
	public By savedAdresses=By.xpath("//p[text()='My Account']/parent::div//a//p[text()='Saved Addresses']");
	
	public By PaymentMethod=By.xpath("//p[text()='My Account']/parent::div//a//p[text()='Payment Methods']");
	
	public By DXLRewardsClub=By.xpath("//p[text()='My Account']/parent::div//a//p[text()='DXL Rewards Club']");
	
	public By logout=By.xpath("//p[text()='My Account']/parent::div//div//button[text()='Log Out']");
	
}
