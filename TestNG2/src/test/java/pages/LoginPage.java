package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.DriverFactory;
import utilities.WaitUtil;

public class LoginPage {
	WebDriver driver = DriverFactory.getDriver();
	By account = By.cssSelector("a[title='My Account']");

	public void login(String email, String password) {

		WaitUtil.waitForClickable(driver, account).click();

		WaitUtil.waitForVisible(driver, By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[2]")).click();

		WaitUtil.waitForVisible(driver, By.id("input-email")).sendKeys(email);

		WaitUtil.waitForVisible(driver, By.id("input-password")).sendKeys(password);

		WaitUtil.waitForVisible(driver, By.cssSelector("input[value='Login']")).click();

	}

}
