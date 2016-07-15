package WD_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups_Test {
WebDriver driver;
	
	@BeforeTest
	public void Startbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
	}

	@AfterTest
	public void Closebrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@Test(groups="sanity")
	public void Login()
	{
		driver.findElement(By.name("userName")).sendKeys("vijay");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
	
	@Test(groups="regression")
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("tester1");
}
}
