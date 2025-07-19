package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.PageUtilities;

public class DashboardPage {
	
	public WebDriver driver;
	private PageUtilities pageutility;
		
	@FindBy(xpath = "//i[@class='fa fa-calendar']/following-sibling::span[text()='Events']")
	WebElement dashboard_eventsbtn;
	
	
	@FindBy(xpath = "//i[@class='fa fa-book font-16']/following-sibling::span[text()='Notes']")
	WebElement dashboard_notesbtn;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		this.pageutility = new PageUtilities(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnEventsBtn() {
		pageutility.clickOnElement(dashboard_eventsbtn);
	}
	
	public void clickOnNotesBtn() {
		pageutility.clickOnElement(dashboard_notesbtn);
	}
}
