package tests;

import org.testng.annotations.Test;

import base.BaseDriver;
import dataproviders.TestDataProviders;
import pages.RegistrationPage;

public class RegistrationTest extends BaseDriver{
  @Test(dataProvider = "RegistrationData", dataProviderClass = TestDataProviders.class)
  public void registration() {
	  RegistrationPage registrationPage = new RegistrationPage();
	  
	 
  }
}
