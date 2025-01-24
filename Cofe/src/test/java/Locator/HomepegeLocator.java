package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.HelperClass;

public class HomepegeLocator {
	
	public By cookieButton=By.id("onetrust-accept-btn-handler");
	
	public By internationalCloseIcon=By.xpath("//header[contains(@id,'chakra-modal')]/following-sibling::button[@aria-label='Close']");
	
	public By currentOffer=By.xpath("//h3[text()='Current Offers']");
	
	public By myAccountIcon=By.xpath("//button[@name='my account']");
	
	public By DXLLogo=By.xpath("//img[@alt='DXL Logo']");
}