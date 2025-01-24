package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectReferences {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public void ObjectReferencesSetup(WebDriver driver, WebDriverWait wait) {
		
		ObjectReferences.driver=driver;
		ObjectReferences.wait=wait;
	}

}
