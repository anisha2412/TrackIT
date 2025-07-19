package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends Base{
	
	public WebDriver driver;
	
	@Test
	public void login() {
		loginpage.logIn(properties.getProperty("email"), properties.getProperty("password"));
		Assert.assertEquals(loginpage.dashboardHeadingCheck(), true);
	}

	
//	@DataProvider(name = "data")
//	public Object[][] getDate()
//	{
//		return new Object[][] 
//		{
//			{"ssss","ssss"},
//			{"ssss","ssss"},
//			{"ssss","ssss"},		
//		};
//	}
	
	
	
}
