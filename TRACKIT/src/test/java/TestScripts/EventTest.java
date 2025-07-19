package TestScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utilities.FakerUtility;

public class EventTest extends Base {
	
	public WebDriver driver;
	@Test
	public void addEvent() {
		loginpage.logIn(properties.getProperty("email"),properties.getProperty("password"));
		dashboardpage.clickOnEventsBtn();
		eventpage.clickOnAddEventbtn();	
		eventpage.addEvent(properties.getProperty("event_title") + FakerUtility.getFakeFirstName(), properties.getProperty("event_description"), 
				properties.getProperty("event_startdate"), properties.getProperty("event_enddate"));			
	}	
	
}
