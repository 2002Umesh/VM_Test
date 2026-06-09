package dataProviders;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
	@DataProvider(name = "register")
	public Object[][] registerData() {
		return new Object[][] { { "john", "smith", "john321@gmail.com", "1029479763", "Password@123" } };
	}

}
