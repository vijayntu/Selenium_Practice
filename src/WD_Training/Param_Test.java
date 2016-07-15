package WD_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param_Test {

WebDriver driver;
	
	@BeforeSuite
	public void Startbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	}

	@AfterSuite
	public void Closebrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@Parameters("url")
	@Test
	public void Login(String nameofUrl)
	{
		driver.get(nameofUrl);
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}
	
	@Test
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("tester1");
	}
	@Test
	public void Home()
	{
		driver.findElement(By.linkText("Home")).click();
	}
}
