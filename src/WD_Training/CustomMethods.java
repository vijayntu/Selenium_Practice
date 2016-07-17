package WD_Training;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomMethods {

	public String readObject(String ObjectName)
	{
		String ObjectProperty = null;
		Properties prop = new Properties();
		try
		{
			FileInputStream fis = new FileInputStream("repository.properties");
			prop.load(fis);
			ObjectProperty= prop.getProperty(ObjectName);			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ObjectProperty;
	}
	
	public WebElement elementProperties(String ObjectName,WebDriver driver)
	{
		CustomMethods cm = new CustomMethods();
		String ObjProp = cm.readObject(ObjectName);
		String [] ObjDetails = ObjProp.split(":");
		WebElement element = null;
		
		switch(ObjDetails[0])
		{
		case "name":
			element =driver.findElement(By.name(ObjDetails[1]));
			break;
		case "xpath":
			element =driver.findElement(By.xpath(ObjDetails[1]));
			break;
		case "link":
			element =driver.findElement(By.linkText(ObjDetails[1]));
			break;
					
		}
		return element;
	}
	
	public void doType(String ObjectName, WebDriver driver, String testData)
	{
		CustomMethods cm = new CustomMethods();
		WebElement element = cm.elementProperties(ObjectName, driver);
		element.sendKeys(testData);
	}
	public void doClick(String ObjectName, WebDriver driver)
	{
		CustomMethods cm = new CustomMethods();
		WebElement element = cm.elementProperties(ObjectName, driver);
		element.click();
	}
	public void waitForElement(WebDriver driver, String ObjectName, int timeOut)
	{
		CustomMethods cm = new CustomMethods();
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		wait.until(ExpectedConditions.visibilityOf(cm.elementProperties(ObjectName, driver)));
	}	
}
