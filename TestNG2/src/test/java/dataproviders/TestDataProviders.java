package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProviders {
	@DataProvider(name = "RegistrationData")
	public Object[][] getRegistrationData() {
		return new Object[][] { { "John", "Doe", "email.com","12894967", "password123" }

		};
	}
}
