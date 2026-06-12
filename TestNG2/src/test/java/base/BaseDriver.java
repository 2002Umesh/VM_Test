package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;

public class BaseDriver {
	DriverFactory driver;
	ConfigReader config;
	
	
	@BeforeMethod
	public void setUp() {
		driver = new DriverFactory();
		config = new ConfigReader();
		driver.initDriver(config.getProperty("browser"));
		driver.getDriver().get(config.getProperty("url"));
		
	}
	@AfterMethod
	public void quitDriver() {
		driver.quitDriver();
	}

}
