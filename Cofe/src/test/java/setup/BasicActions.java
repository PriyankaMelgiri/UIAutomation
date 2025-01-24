package setup;

import org.testng.Assert;


import Locator.HomepegeLocator;
import Locator.InternationalShippingPOPUpLocator;
import Locator.MyAccountFlyoutLocator;
import Locator.HomepegeLocator;
import Locator.SignInLocator;
import Locator.SiteLoginLocator;

public class BasicActions {

	SiteLoginLocator siteLoginLocator;
	MyAccountFlyoutLocator myAccountFlyoutLocator;
	HomepegeLocator homepegeLocator;
	//CookieLocator cookieLocator;
	SignInLocator signInLocator;
	InternationalShippingPOPUpLocator internationalShippingPOPUpLocator;
	HelperClass helperClass;
	
	public void BasicProcess(){
		siteLoginLocator=new SiteLoginLocator();
		helperClass=new HelperClass();
		
		if(helperClass.getElement(siteLoginLocator.passwordProtectedSiteHeading).isDisplayed()) {
			helperClass.getElement(siteLoginLocator.passwordField).sendKeys("DXLG#dotcom24");
			helperClass.getElement(siteLoginLocator.submitButton).click();
			
		}	
	}
	
	public void cookieAccept() {
	//	cookieLocator=new CookieLocator();	
	//	cookieLocator.cookieButton.click();
		homepegeLocator=new HomepegeLocator();
		helperClass.getElement(homepegeLocator.cookieButton).click();
		helperClass.getElement(homepegeLocator.internationalCloseIcon).click();
//		if(helperClass.getElement(homepegeLocator.currentOffer).isDisplayed()) {
//			helperClass.getElement(homepegeLocator.currentOffer).click();
//		}
//		else {
//			
//		}
//		
	}
	
	public void SignIn() {
		myAccountFlyoutLocator=new MyAccountFlyoutLocator();
		helperClass.getElement(homepegeLocator.myAccountIcon).click();
		//homepegeLocator.myAccountIcon.click();
		helperClass.getElement(myAccountFlyoutLocator.SignInButton).click();
	
		signInLocator=new SignInLocator();
		helperClass.getElement(signInLocator.Auth0EmailField).sendKeys("priyankapatil@yopmail.com");
		helperClass.getElement(signInLocator.Auth0PasswordField).sendKeys("Priyanka1@");
		helperClass.getElement(signInLocator.Auth0ContinueButton).click();
		
	
		 boolean myAccountLoggedUser=helperClass.getElement(homepegeLocator.myAccountIcon).getAttribute("aria-label").contains("Guest");
		 Assert.assertFalse(myAccountLoggedUser);
		 internationalShippingPOPUpLocator=new InternationalShippingPOPUpLocator();
		 helperClass.getElement(internationalShippingPOPUpLocator.InternationalShippingCloseIcon).click();
	}
}
