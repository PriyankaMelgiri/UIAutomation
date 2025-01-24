package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.HelperClass;

public class SiteLoginLocator {
	
	public By passwordProtectedSiteHeading=By.xpath("//h1[text()='Password protected site']");

	public By passwordField=By.xpath("//input[@name='password']");
	
	public By submitButton=By.xpath("//button[text()='Submit']");
	
	
}
