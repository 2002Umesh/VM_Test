package tests;

import org.testng.annotations.Test;

import base.BaseDriver;
import dataproviders.TestDataProviders;

import pages.SearchPage;

public class SearchTest extends BaseDriver {

	@Test(priority = 3, enabled = true, dataProvider = "SearchData", dataProviderClass = TestDataProviders.class)
	public void logins(String item) throws InterruptedException {
		SearchPage pompages = new SearchPage();

		pompages.search(item);

	}

}
