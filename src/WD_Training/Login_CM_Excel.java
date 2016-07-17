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

public class Login_CM_Excel {

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
		Workbook wb;
		try {
			wb = Workbook.getWorkbook(new File("Excel_Test2.xls"));
		
		Sheet Sh = wb.getSheet(0);
		for (int i=1;i<Sh.getRows();i++)
			
			switch(Sh.getCell(1, i).getContents())
			{
			
			case "doType":
				cm.doType(Sh.getCell(2,i).getContents(), driver, Sh.getCell(3,i).getContents());
				break;
			case "doClick":	
				cm.doClick(Sh.getCell(2,i).getContents(), driver);
				break;
			}
		} catch (BiffException e) {
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
	driver.quit();
	driver.close();
}
}
