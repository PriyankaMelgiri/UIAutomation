package testPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Locator.HomepegeLocator;
import Locator.MyAccountFlyoutLocator;
import Locator.PaymentMethodsLocator;
import Locator.ProfileandPreferencesLocator;
import setup.BasicActions;
import setup.HelperClass;
import setup.setupDriver;

public class PaymentMethodTestPage extends setupDriver{
	
	BasicActions basicActions;
	HomepegeLocator homepegeLocator;
	MyAccountFlyoutLocator myAccountFlyoutLocator;
	ProfileandPreferencesLocator profileandPreferencesLocator;
	HelperClass helperClass;
	PaymentMethodsLocator paymentMethodsLocator;
	
  @Test
  public void updateCreditCard() throws InterruptedException {
	  basicActions=new BasicActions();
	  helperClass=new HelperClass();
	  basicActions.siteLogin();
	  basicActions.cookieAccept();
	  basicActions.SignIn();
	  homepegeLocator=new HomepegeLocator();
	  Thread.sleep(5000);
	  helperClass.getElement(homepegeLocator.myAccountIcon).click();
	  myAccountFlyoutLocator=new MyAccountFlyoutLocator();
	  helperClass.getElement(myAccountFlyoutLocator.PaymentMethod).click();
	  paymentMethodsLocator =new PaymentMethodsLocator();
	  helperClass.getElement(paymentMethodsLocator.paymentMethodsLink).click();
	  helperClass.getElement(paymentMethodsLocator.editButton).click();
	  helperClass.getElement(paymentMethodsLocator.cardNameField).sendKeys("CreditCard");
	  helperClass.getElement(paymentMethodsLocator.expireDateField).sendKeys("11/34");
	  helperClass.getElement(paymentMethodsLocator.updateButton).click();
	  boolean cardUpdatedSuccessMessage=helperClass.getElement(paymentMethodsLocator.cardUpdatedSuccessMessage).isDisplayed();
	  Assert.assertTrue(cardUpdatedSuccessMessage);
  }
}
