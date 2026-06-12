package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static void initDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver.set(new ChromeDriver());
		} else if(browser.equalsIgnoreCase("firefox")) {
			driver.set(new FirefoxDriver());
		} else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();

			options.addArguments("--headless=new");
			options.addArguments("--disable-gpu");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--remote-allow-origins=*");

			driver.set(new EdgeDriver(options));
		} else {
			throw new IllegalArgumentException("Browser not supported: " + browser);
		}
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	public static void quitDriver() {
		if(driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
