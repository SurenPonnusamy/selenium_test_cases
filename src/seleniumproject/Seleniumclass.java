package seleniumproject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import seleniumproject.driverClass.*;

@Test
public class Seleniumclass {
	
	WebDriver driver;
	
	public void loginPageTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surendhar.ponnusamy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:81/");
		driver.findElement(By.id("formBasicEmail")).sendKeys("admin"); 
		driver.findElement(By.id("formBasicPassword")).sendKeys("admin");
		driver.findElement(By.id("submitBtn")).click();
		String title = driver.findElement(By.id("homeHeading")).getText();
		String expectedString = "CNAP sample react CICD dashboard";
		assertEquals(title, expectedString);
		driver.close();
	}
	public void addBuildServerTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\surendhar.ponnusamy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:81/home");
		driver.findElement(By.id("buildServerIcon")).click();
		String buildServertitle = driver.findElement(By.id("buildServerHeading")).getText();
		String expectedBuildServertitle = "CNAP Build Server";
		assertEquals(buildServertitle, expectedBuildServertitle);
		driver.close();
	}
}
