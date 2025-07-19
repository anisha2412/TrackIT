package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtilities;

public class LoginPage {
	
	public WebDriver driver;
	private PageUtilities pageutility;
		
	@FindBy(xpath = "//input[@type='text' and @name='email' and @placeholder='Email']")
	WebElement email_feild;
	
	@FindBy(xpath = "//input[@type='password' and @name='password' and @placeholder='Password']")
	WebElement password_feild;
	
	@FindBy(xpath = "//button[contains(@class , 'btn-primary') and @type=\"submit\"]")
	WebElement signin_btn;
	
	@FindBy(xpath = "//h4[@class='pull-left' and text()='Dashboard']")
	WebElement dashbord_heading;
			
	public LoginPage(WebDriver driver) {
		this.driver= driver;				
		this.pageutility = new PageUtilities(driver);   // object inilization | const. for PageUtilities.java will be created automatically
		PageFactory.initElements(driver, this);	
	}

	public LoginPage logIn(String email, String password) {			  // method to login		
		pageutility.enterTextOnWebElement(email_feild, email);
		pageutility.enterTextOnWebElement(password_feild, password);  // enter value to txtbox using pageutility method | emailfield and emailvalue passing from testcase		                     
		pageutility.clickOnElement(signin_btn);
		return this;		
	}	
	
	public boolean dashboardHeadingCheck()
	{
		return dashbord_heading.isDisplayed();
	}	
	
	
}
