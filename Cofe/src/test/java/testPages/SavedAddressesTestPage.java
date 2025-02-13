package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Locator.HomepegeLocator;
import Locator.MyAccountFlyoutLocator;
import Locator.SavedAddressesLocator;
import setup.BasicActions;
import setup.HelperClass;
import setup.setupDriver;

public class SavedAddressesTestPage extends setupDriver {
	
	BasicActions basicActions;
	HomepegeLocator homepegeLocator;
	HelperClass helperClass;
	SavedAddressesLocator savedAddressesLocator;
	MyAccountFlyoutLocator myAccountFlyoutLocator;
	
  @Test
  public void addAddress() throws InterruptedException {
	  basicActions=new BasicActions();
	  homepegeLocator=new HomepegeLocator();
	  helperClass=new HelperClass();
	  myAccountFlyoutLocator=new MyAccountFlyoutLocator();
	  savedAddressesLocator=new SavedAddressesLocator();
	  basicActions.siteLogin();
	  basicActions.cookieAccept();
	  basicActions.SignIn();
	  Thread.sleep(2000);
	  helperClass.getElement(homepegeLocator.myAccountIcon).click();
	  helperClass.getElement(myAccountFlyoutLocator.savedAdresses).click();
	  Thread.sleep(1000);
	  helperClass.getElement(savedAddressesLocator.savedAddressesLink).click();
	  helperClass.getElement(savedAddressesLocator.addAddressForm).click();
	  helperClass.getElement(savedAddressesLocator.firstNameField).clear();
	  helperClass.getElement(savedAddressesLocator.firstNameField).sendKeys("Priyanka");
	  helperClass.getElement(savedAddressesLocator.lastNameField).clear();
	  helperClass.getElement(savedAddressesLocator.lastNameField).sendKeys("Patil");
	  helperClass.getElement(savedAddressesLocator.addressPOBoxField).sendKeys("Po Box");
	  helperClass.getElement(savedAddressesLocator.addressSuggestionList).click();
	  helperClass.getElement(savedAddressesLocator.phoneNumberField).sendKeys("2121111111");
	  helperClass.getElement(savedAddressesLocator.addAddressButton).click();
	  boolean addressAddedSucessMessage=helperClass.getElement(savedAddressesLocator.addressAddedSucessMessage).isDisplayed();
	  Assert.assertTrue(addressAddedSucessMessage);
  }
  
  @Test
  public void editAddress() throws InterruptedException {
	  Thread.sleep(3000);
	  helperClass.getElement(savedAddressesLocator.editButton).click();
	  helperClass.getElement(savedAddressesLocator.phoneNumberField).sendKeys("2121111111");
	  helperClass.getElement(savedAddressesLocator.updateInformationButton).click();
	  boolean updateAddressSuccessMessage=helperClass.getElement(savedAddressesLocator.updateAddressSuccessMessage).isDisplayed();
	  Assert.assertTrue(updateAddressSuccessMessage);
  }
  
  @Test
  public void deleteAddress() {
	  helperClass.getElement(savedAddressesLocator.deleteButton).click();
	  helperClass.getElement(savedAddressesLocator.deleteButtonConfirm).click();
  }
  
  @Test
  public void setAsDefault() throws InterruptedException {
	  Thread.sleep(3000);
	  helperClass.getElement(savedAddressesLocator.setAsDefaultRadioButton).click();
	  boolean defaultAddressSetSuccessMessage=helperClass.getElement(savedAddressesLocator.defaultAddressSetSuccess).isDisplayed();
	  Assert.assertTrue(defaultAddressSetSuccessMessage);
  }
}
