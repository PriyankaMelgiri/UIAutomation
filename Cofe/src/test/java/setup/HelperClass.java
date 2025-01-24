package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HelperClass extends ObjectReferences{
	

	public WebElement getElement(By locator) {
		
			 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
			
	}
}
