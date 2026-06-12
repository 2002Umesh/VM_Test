package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverFactory;

public class RegistrationPage {
	WebDriver driver = DriverFactory.getDriver();
	
	private static final By ACCOUNT = By.cssSelector("a[title='My Account']");
	

}
