package StepDefinitions_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitions {
	WebDriver driver;
	
	@Before
	public void setup() {
		driver = new EdgeDriver();
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
	    driver.findElement(By.id("signin_button")).click();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_abcd_and_zxcvbnm(String user, String pass) {
	    driver.findElement(By.id("user_login")).sendKeys(user);
	    driver.findElement(By.id("user_password")).sendKeys(pass);
	}

	@And("user click login button")
	public void user_click_login_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("validate login result")
	public void validate_login_result() {
	 System.out.println("login success");
	}



}
