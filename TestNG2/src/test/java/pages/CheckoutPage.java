package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.DriverFactory;
import utilities.WaitUtil;

public class CheckoutPage {
	WebDriver driver = DriverFactory.getDriver();
	By search_products = By.cssSelector("div[class='product-thumb']");
	By search = By.cssSelector("input[name='search']");
	
	public void checkout(String item) {
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement s= WaitUtil.waitForClickable(driver, search);
		s.sendKeys(item);
		s.sendKeys(Keys.ENTER);
		List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(search_products));
		products.get(1).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-cart"))).click();

		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("button-cart"))).click();

		WebElement cartIcon = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Shopping Cart']")));

		cartIcon.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div[3]/div[1]/a"))).click();
	}

}
