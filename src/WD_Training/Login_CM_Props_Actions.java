package WD_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_CM_Props_Actions {
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
		cm.doType("Username", driver, "test");
		cm.doType("Password", driver, "test");
		cm.waitForElement(driver, "LoginButton", 5);
		cm.doClick("LoginButton", driver);
}


@AfterTest
public void stop()
{
	driver.quit();
	driver.close();
}
}
