package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	private static final int TIMEOUT =15;
	
	public static void waitForVisisble(WebDriver driver,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static void waitForClickable(WebDriver driver,By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
//	public static void waitForAllVisisble(WebDriver driver,By locator) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//		
//		wait.until(ExpectedConditions.visibilityOfAllElements(locator));
//	}
	

}
