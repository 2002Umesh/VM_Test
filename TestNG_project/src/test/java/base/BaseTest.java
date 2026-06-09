package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.ConfigReader;

public class BaseTest {
	protected ConfigReader config;
	
	@BeforeMethod
	public void setup() {
		config =new ConfigReader();
		DriverFactory.initDriver(config.getProperty("browser"));
		DriverFactory.getDriver().get("baseURL");
	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
