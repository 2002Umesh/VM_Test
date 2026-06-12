package tests;

import org.testng.annotations.Test;

import base.BaseDriver;
import dataproviders.TestDataProviders;
import pages.LoginPage;

public class LoginTest extends BaseDriver{
	@Test(priority = 2, enabled = true, dataProvider = "LoginData", dataProviderClass = TestDataProviders.class)
	public void logins(String email, String password) throws InterruptedException {
		LoginPage pompages = new LoginPage();

		pompages.login(email, password);

	}

}
