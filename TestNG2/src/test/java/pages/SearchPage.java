package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverFactory;
import utilities.WaitUtil;

public class SearchPage {
	WebDriver driver = DriverFactory.getDriver();
	
	By search = By.cssSelector("input[name='search']");
	
	public void search(String item) {
		WebElement s= WaitUtil.waitForClickable(driver, search);
		s.sendKeys(item);
		s.sendKeys(Keys.ENTER);
	
		
	}

}
