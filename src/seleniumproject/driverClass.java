package seleniumproject;

import org.openqa.selenium.WebDriver;


public class driverClass {

	WebDriver driver;
	
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surendhar.ponnusamy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	}
	
}
