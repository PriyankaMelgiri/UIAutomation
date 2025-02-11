package setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setupDriver {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	ObjectReferences objectReferences;
	
  @BeforeClass
  public void LaunchSite() {
	  driver=new ChromeDriver();
	  driver.get("https://alpha.cofe.dxl.com/");
	  driver.manage().window().maximize();
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  action=new Actions(driver);
	  objectReferences=new ObjectReferences();
	  objectReferences.ObjectReferencesSetup(driver,wait);
	  
  }
  
  @AfterClass
  public void quite() {
	  driver.close();
  }
}
