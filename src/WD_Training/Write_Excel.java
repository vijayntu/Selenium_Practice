package WD_Training;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write_Excel {

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
	public void doLogin() throws IOException, RowsExceededException, WriteException
	{
		WritableWorkbook wb = Workbook.createWorkbook(new File("write_excel.xls"));
		WritableSheet Sh = wb.createSheet("Reports",  0);
		
		Label name = new Label(1,2,"testData");
		
		Sh.addCell(name);
		
		wb.write();
		
		wb.close();
}


@AfterTest
public void stop()
{
	driver.quit();
	driver.close();
}
}
