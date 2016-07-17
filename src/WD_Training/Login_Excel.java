package WD_Training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login_Excel {
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
		try {
			Workbook wb = Workbook.getWorkbook(new File("Excel_Test"));
			Sheet sh = wb.getSheet(0);
			
			for(int i=1;i<sh.getRows();i++)
			
		
		cm.elementProperties("Username", driver).sendKeys(sh.getCell(0, i).getContents());
		//cm.elementProperties("Password", driver).sendKeys(sh.getCell(1, i).getContents());
		cm.elementProperties("LoginButton", driver).click();
		cm.elementProperties("link",  driver).click();
		
		} 
	
		  catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterTest
	public void stop()
	{
		driver.close();
	}
}
