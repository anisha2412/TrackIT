package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NotesTest extends Base{
	
	WebDriver driver;
	
	@Test
	public void addNotes() {
		loginpage.logIn(properties.getProperty("email"),properties.getProperty("password"));
		dashboardpage.clickOnNotesBtn();;
				
	}	
	

}
