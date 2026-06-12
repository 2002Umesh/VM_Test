package tests;

import org.testng.annotations.Test;

import base.BaseDriver;
import dataproviders.TestDataProviders;
import pages.CheckoutPage;
import pages.SearchPage;

public class CheckoutTest extends BaseDriver{
  @Test(priority = 4, enabled = true, dataProvider = "CheckoutData", dataProviderClass = TestDataProviders.class)
  public void checkout(String item) {
	 CheckoutPage page =new CheckoutPage();
	 page.checkout(item);
  }
}
