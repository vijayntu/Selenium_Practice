package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Suite_Test2 {

WebDriver driver;
	
	@Test
	public void Login()
	{
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
}
