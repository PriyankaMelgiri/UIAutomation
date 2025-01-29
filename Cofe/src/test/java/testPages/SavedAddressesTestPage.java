package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Locator.HomepegeLocator;
import Locator.MyAccountFlyoutLocator;
import Locator.SavedAddressesLocator;
import setup.BasicActions;
import setup.HelperClass;

public class SavedAddressesTestPage {
	
	BasicActions basicActions;
	HomepegeLocator homepegeLocator;
	HelperClass helperClass;
	SavedAddressesLocator savedAddressesLocator;
	MyAccountFlyoutLocator myAccountFlyoutLocator;
	
  @Test
  public void addAddress() {
	  basicActions=new BasicActions();
	  homepegeLocator=new HomepegeLocator();
	  helperClass=new HelperClass();
	  myAccountFlyoutLocator=new MyAccountFlyoutLocator();
	  savedAddressesLocator=new SavedAddressesLocator();
	  basicActions.siteLogin();
	  basicActions.cookieAccept();
	  basicActions.SignIn();
	  helperClass.getElement(homepegeLocator.myAccountIcon).click();
	  helperClass.getElement(myAccountFlyoutLocator.savedAdresses).click();
	  helperClass.getElement(savedAddressesLocator.savedAddressesLink).click();
	  helperClass.getElement(savedAddressesLocator.addAddressForm).click();
	  helperClass.getElement(savedAddressesLocator.firstNameField).clear();
	  helperClass.getElement(savedAddressesLocator.firstNameField).sendKeys("Priyanka");
	  helperClass.getElement(savedAddressesLocator.lastNameField).clear();
	  helperClass.getElement(savedAddressesLocator.lastNameField).sendKeys("Patil");
	  helperClass.getElement(savedAddressesLocator.addressPOBoxField).sendKeys("Po Box");
	  helperClass.getElement(savedAddressesLocator.addressSuggestionList).click();
	  helperClass.getElement(savedAddressesLocator.addAddressButton).click();
	  helperClass.getElement(savedAddressesLocator.phoneNumberField).sendKeys("2121111111");
	  helperClass.getElement(savedAddressesLocator.addAddressButton).click();
	  boolean addressAddedSucessMessage=helperClass.getElement(savedAddressesLocator.addressAddedSucessMessage).isDisplayed();
	  Assert.assertTrue(addressAddedSucessMessage);
  }
}
