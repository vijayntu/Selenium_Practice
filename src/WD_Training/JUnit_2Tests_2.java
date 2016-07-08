package WD_Training;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnit_2Tests_2 {

	static WebDriver driver;
	
	@BeforeClass
	public static void Startbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@AfterClass
	public static void Closebrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.name("userName")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		
	}
	
	@Ignore
	@Test
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("tester1");
}
}
