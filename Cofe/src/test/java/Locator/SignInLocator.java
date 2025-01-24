package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.HelperClass;

public class SignInLocator{
	
	public By Auth0EmailField=By.id("username");
	
	public By Auth0PasswordField=By.id("password");
	
	public By Auth0ContinueButton=By.xpath("//form//div//button[text()='Continue']");
	
	

}
