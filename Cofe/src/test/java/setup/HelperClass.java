package setup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HelperClass extends ObjectReferences{
	

	public WebElement getElement(By locator) {
		
			 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
			
	}
	
	public List<WebElement> getElements(By locator){
		 wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		 return driver.findElements(locator);
	}
}
