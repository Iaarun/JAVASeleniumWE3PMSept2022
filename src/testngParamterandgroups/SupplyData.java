package testngParamterandgroups;

import org.testng.annotations.DataProvider;

public class SupplyData {

	@DataProvider
	public Object[][] loginData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "cbatest7@gmail.com";
		data[0][1] = "cba@test";
		data[1][0] = "cbatest7@gmail.com";
		data[1][1] = "cba@test";

		return data;

	}

}
