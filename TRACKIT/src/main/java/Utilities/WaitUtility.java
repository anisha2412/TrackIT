package Utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Constants.Constants;

public class WaitUtility {
	
	public WebDriver driver;
	
	public static void waitForVisiblityOfAnElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICITWAIT));  
		wait.until(ExpectedConditions.visibilityOf(element));	
	}

}
