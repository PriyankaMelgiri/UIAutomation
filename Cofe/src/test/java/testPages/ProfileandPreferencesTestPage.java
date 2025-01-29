package testPages;

import java.time.Instant;
import java.util.Random;

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
  public void NavigateToProfileandPreferences() throws InterruptedException {
	  basicActions=new BasicActions();
	  helperClass=new HelperClass();
	  basicActions.siteLogin();
	  basicActions.cookieAccept();
	  basicActions.SignIn();
	  homepegeLocator=new HomepegeLocator();
	  Thread.sleep(5000);
	  helperClass.getElement(homepegeLocator.myAccountIcon).click();
	  myAccountFlyoutLocator=new MyAccountFlyoutLocator();
	  helperClass.getElement(myAccountFlyoutLocator.ProfileandPreferences).click();
	  profileandPreferencesLocator=new ProfileandPreferencesLocator();
	
	  boolean ProfileandPreferencesHeading=helperClass.getElement(profileandPreferencesLocator.ProfileandPreferencesHeading).isDisplayed();
	  Assert.assertTrue(ProfileandPreferencesHeading);
	  
  }
  
  @Test(priority=2)
  public void UpdateFirstName() {
	  helperClass=new HelperClass();
	  profileandPreferencesLocator=new ProfileandPreferencesLocator();
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();
	  Random random=new Random();
	  char c=(char)(random.nextInt(26)+97);
//	 Instant num=Instant.now();
//	 int Randomnumber=num.getNano();
	  helperClass.getElement(profileandPreferencesLocator.FirstnameField).clear();
	 helperClass.getElement(profileandPreferencesLocator.FirstnameField).sendKeys("Priyanka"+c);
	 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
	 boolean SuccessToastMessage=helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
	 Assert.assertTrue(SuccessToastMessage);
  }
  
  @Test(priority=3)
  public void UpdateLastName() throws InterruptedException {
	  Thread.sleep(3000);
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();
	  Random random=new Random();
	  char c=(char)(random.nextInt(26)+97);
	  helperClass.getElement(profileandPreferencesLocator.LastNamefield).clear();  
	  helperClass.getElement(profileandPreferencesLocator.LastNamefield).sendKeys("Patil"+c);
	  helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
	  boolean SuccessToastMessage=helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
		 Assert.assertTrue(SuccessToastMessage);
  }
  
  @Test(priority=4)
  public void UpdateEmailaddress() throws InterruptedException {
	  Thread.sleep(3000);
	  helperClass.getElement(profileandPreferencesLocator.EditButton).click();

	 String EmailIdDisplayed= helperClass.getElement(profileandPreferencesLocator.EmailField).getAttribute("value");
	 for(int i=1;i<=2;i++) {
		 if(EmailIdDisplayed.contains("1")) {
//			 String num;
//			 switch(helperClass.getElement(profileandPreferencesLocator.EmailField)) {
//			 case "1":
//				 
//			 }
			 helperClass.getElement(profileandPreferencesLocator.EmailField).clear();
			 helperClass.getElement(profileandPreferencesLocator.EmailField).sendKeys("priyankapatil2@yopmail.com");
			 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
			boolean SuccessToastMessage= helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
			 Assert.assertTrue(SuccessToastMessage);
		 }
		 else {
			 helperClass.getElement(profileandPreferencesLocator.EmailField).clear();
			 helperClass.getElement(profileandPreferencesLocator.EmailField).sendKeys("priyankapatil1@yopmail.com");
			 helperClass.getElement(profileandPreferencesLocator.UpdateInformationButton).click();
			boolean SuccessToastMessage= helperClass.getElement(profileandPreferencesLocator.SuccessToastMessage).isDisplayed();
			 Assert.assertTrue(SuccessToastMessage);
		 }
	 }
  }
}
