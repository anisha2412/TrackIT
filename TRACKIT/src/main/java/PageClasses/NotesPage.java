package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class NotesPage {
	
	public WebDriver driver;
	private PageUtilities pageutility;
	
	@FindBy(xpath = "//i[@class='fa fa-plus-circle']//preceding::a[@title='Add note']")
	WebElement addnotes_btn;
	
	public NotesPage(WebDriver driver) {
		this.driver=driver;
		this.pageutility = new PageUtilities(driver);
		PageFactory.initElements(driver, this);		
	}
	
	public void addNote() {
		
	}

}
