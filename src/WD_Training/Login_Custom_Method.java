package WD_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Custom_Method {

	CustomMethods cm = new CustomMethods();
	
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void doLogin()
	{
		cm.elementProperties("Username", driver).sendKeys("test");
		cm.elementProperties("Password", driver).sendKeys("test");
		cm.elementProperties("LoginButton", driver).click();
	}
	
	@AfterTest
	public void stop()
	{
		driver.close();
	}
}
