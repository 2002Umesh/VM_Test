package StepDefinitions_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitions {
	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void setup() {
//	    EdgeOptions options = new EdgeOptions();
//
//	    options.addArguments("--headless=new");
//	    options.addArguments("--disable-gpu");
//	    options.addArguments("--window-size=1920,1080");
//	    options.addArguments("--no-sandbox");
//	    options.addArguments("--disable-dev-shm-usage");
//	    options.addArguments("--remote-allow-origins=*");
//
//	    driver = new EdgeDriver(options);

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--headless=new");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");

		driver = new ChromeDriver(options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.get("http://zero.webappsecurity.com");
	}
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
//	@Given("User should open in default browser")
//	public void user_should_open_in_default_browser() {
//	    driver = new EdgeDriver();
//	    driver.get("http://zero.webappsecurity.com");
//	}

	@Given("user click on login")
	public void user_click_on_login() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signin_button"))).click();
//	    driver.findElement(By.id("signin_button")).click();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_abcd_and_zxcvbnm(String user, String pass) {
//	    driver.findElement(By.id("user_login")).sendKeys(user);
//	    driver.findElement(By.id("user_password")).sendKeys(pass);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login"))).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_password"))).click();
	}

	@And("user click login button")
	public void user_click_login_button() {
//	    driver.findElement(By.name("submit")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit"))).click();
	}

	@Then("validate login result")
	public void validate_login_result() {
	 System.out.println("login success");
	}



}
