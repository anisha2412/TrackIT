package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;
import Utilities.WaitUtility;

public class EventsPage {

	public WebDriver driver;
	private PageUtilities pageutility;
	
	@FindBy(xpath = "(//a[@title='Add event'])[2]")
	WebElement eventpage_addeventbtn;
	
	@FindBy(xpath = "//h4[@class='modal-title' and @id='ajaxModalTitle']/self::h4[text()='Add event']")
	WebElement addevent_modal;
		
	@FindBy(xpath = "//input[@id='title' and @class='form-control']")
	WebElement eventtitle_feild;
	
	
	@FindBy(xpath = "//textarea[@id='description' and @class='form-control']")
	WebElement eventdescription_feild;
	
	@FindBy(xpath = "//input[@id='start_date' and @class='form-control']")
	WebElement eventstartdate_feild;
	
	@FindBy(xpath = "//input[@id='end_date' and @class='form-control']")
	WebElement eventenddate_feild;
	
	@FindBy(xpath = "//button[@type='submit' and @class='btn btn-primary']")
	WebElement event_savebtn;
			
	public EventsPage(WebDriver driver) {
		this.driver=driver;
		this.pageutility= new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddEventbtn() {		
		pageutility.clickOnElement(eventpage_addeventbtn);
		WaitUtility.waitForVisiblityOfAnElement(driver, addevent_modal); 
	}
	
	public void addEvent(String event_title,String event_description,String event_startdate,String event_enddate) {		
		pageutility.enterTextOnWebElement(eventtitle_feild, event_title);
		pageutility.enterTextOnWebElement(eventdescription_feild, event_description);
		pageutility.enterTextOnWebElement(eventstartdate_feild, event_startdate);
		pageutility.enterTextOnWebElement(eventenddate_feild, event_enddate);
		pageutility.clickOnElement(event_savebtn);
	}
	
}









