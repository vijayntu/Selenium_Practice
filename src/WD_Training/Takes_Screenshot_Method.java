package WD_Training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takes_Screenshot_Method {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.91mobiles.com/lenovo-z1-price-in-india");
		Takes_Screenshot_Method s = new Takes_Screenshot_Method();
		s.takesScreenshot("F://Test.jpg");
		}

	void takesScreenshot(String Fname) throws IOException
	{
		File Image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Image, new File(Fname));
	}
	
}
