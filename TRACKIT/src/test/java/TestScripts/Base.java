package TestScripts;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Constants.Constants;
import PageClasses.DashboardPage;
import PageClasses.EventsPage;
import PageClasses.LoginPage;
import PageClasses.NotesPage;

public class Base {
	
	public WebDriver driver;				   // sele webdriver object
	public Properties properties;              // object for handling pptys file
	public FileInputStream fis;                // for handling file opertions in ppty file
	
	LoginPage loginpage; 
	DashboardPage dashboardpage;
	EventsPage eventpage;
	NotesPage notespage;
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"browser"})
	public void browserinitailzation(String browserName) throws Exception 
	{		
		properties = new Properties();                    // pptys cls obj - initalization
		fis = new FileInputStream(Constants.CONFIGFILE);  // constant classname.varname [to acces static var] | ppty file path
		properties.load(fis);                             // load congfig file to read
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver =  new ChromeDriver();
		}		
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();			
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();			
		}
		else {
			throw new Exception("Invalid Browser Name Exception!!");
		}
		driver.get(properties.getProperty("URL"));                            // application url
		driver.manage().window().maximize();                                  // window maximise  
		
		
		loginpage = new LoginPage(driver);                        //const. created at loginPage class
		dashboardpage = new DashboardPage(driver);
		eventpage = new EventsPage(driver);
		notespage =  new NotesPage(driver);
	}
	
	//@AfterMethod()
//	public void tearDown() {
//		driver.quit();
//	}
		
}
