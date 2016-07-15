package WD_Training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Prov_Test1 {
WebDriver driver;
	
	@BeforeSuite
	public void Startbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
	}

	@DataProvider(name = "testdata")
	public Object[][] loginCredentials()
	{
		Object [][] Obj = new Object[2][2];
		Obj [0][0]= "test";
		Obj [0][1]= "test";
		Obj [1][0]= "Vijay";
		Obj [1][1]="Vijay";
		
		return Obj;
		
	}
	
	@AfterSuite
	public void Closebrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@Test(dataProvider="testdata")
	public void Login(String username, String password)
	{
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		//Assert.assertEquals(driver.getTitle(), "Sign-: Mercury Tours");
	}
	
	/*@Test
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("tester1");
}*/
}
