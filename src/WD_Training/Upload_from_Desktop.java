package WD_Training;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_from_Desktop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/WebDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.tinypic.com/");
		
		driver.findElement(By.id("the_file")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("F:/Selenium/Docs/WebDriver/TestFiles/upload.exe");
	}

}
