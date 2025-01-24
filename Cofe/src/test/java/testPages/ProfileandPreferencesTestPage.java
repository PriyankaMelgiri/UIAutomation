package testPages;

import java.time.Instant;

import org.testng.Assert;
import org.testng.annotations.Test;

import Locator.HomepegeLocator;
import Locator.MyAccountFlyoutLocator;
import Locator.ProfileandPreferencesLocator;
import setup.BasicActions;
import setup.HelperClass;
import setup.setupDriver;

public class ProfileandPreferencesTestPage extends setupDriver{
	
	BasicActions basicActions;
	HomepegeLocator homepegeLocator;
	MyAccountFlyoutLocator myAccountFlyoutLocator;
	ProfileandPreferencesLocator profileandPreferencesLocator;
	HelperClass helperClass;
	
  @Test(priority=1)
  public void NavigateToProfileandPreferences() {
	  basicActions=new BasicActions();
	  helperClass=new HelperClass();
	  basicActions.BasicProcess();
	  basicActions.cookieAccept();
	  basicActions.SignIn();
	  homepegeLocator=new HomepegeLocator();
	  helperClass.getElement(homepegeLocator.myAccountIcon).click();
	  myAccountFlyoutLocator=new MyAccountFlyoutLocator();
	  helperClass.getElement(myAccountFlyoutLocator.ProfileandPreferences).click();
	  profileandPreferencesLocator=new ProfileandPreferencesLocator();
	
	  boolean ProfileandPreferencesHeading=helperClass.getElement(profileandPreferencesLocator.ProfileandPreferencesHeading).isDisplayed();
	  Assert.assertTrue(ProfileandPreferencesHeading);
	  
  }
  
  @Test
  public void UpdateFirstName() {
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();
	 Instant num=Instant.now();
	 int Randomnumber=num.getNano();
	 helperClass.getElement(profileandPreferencesLocator.FirstnameField).sendKeys("Priyanka"+Randomnumber);
	 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
	 boolean SuccessToastMessage=helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
	 Assert.assertTrue(SuccessToastMessage);
  }
  
  @Test
  public void UpdateLastName() {
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();
	  Instant num=Instant.now();
	  int RandomNumber=num.getNano();
	  helperClass.getElement(profileandPreferencesLocator.LastNamefield).sendKeys("Patil"+RandomNumber);
	  helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
	  boolean SuccessToastMessage=helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
		 Assert.assertTrue(SuccessToastMessage);
  }
  
  @Test
  public void UpdateEmailaddress() {
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();
//	  Instant num=Instant.now();
//	  int RandomNumber=num.getNano();
	 String EmailIdDisplayed= helperClass.getElement(profileandPreferencesLocator.EmailField).getAttribute("value");
	 for(int i=1;i<=2;i++) {
		 if(EmailIdDisplayed.contains("1")) {
//			 String num;
//			 switch(helperClass.getElement(profileandPreferencesLocator.EmailField)) {
//			 case "1":
//				 
//			 }
			 helperClass.getElement(profileandPreferencesLocator.EmailField).sendKeys("priyankapatil2@yopmail.com");
			 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
			boolean SuccessToastMessage= helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
			 Assert.assertTrue(SuccessToastMessage);
		 }
		 else {
			 helperClass.getElement(profileandPreferencesLocator.EmailField).sendKeys("priyankapatil1@yopmail.com");
			 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
			boolean SuccessToastMessage= helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
			 Assert.assertTrue(SuccessToastMessage);
		 }
	 }
  }
}
