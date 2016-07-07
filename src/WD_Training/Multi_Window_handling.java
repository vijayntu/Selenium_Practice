package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multi_Window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.91mobiles.com/lenovo-z1-price-in-india");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='overview']/div[2]/div[3]/div[10]/div[1]/span/div[1]/img")));	
		
		String PWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id='overview']/div[2]/div[3]/div[10]/div[2]/span/div[1]/img")).click();
		
		for (String CWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(CWindow);
			Thread.sleep(10000);
			if(driver.getTitle().contains("Lenovo ZUK Z1 Dial 07500860969 FOR ANY Help | eBay"))
			{		
				wait.until(ExpectedConditions.elementToBeClickable(By.id("binBtn_btn")));
				driver.findElement(By.id("binBtn_btn")).click();
				driver.close();
				break;
		}			
	}
		driver.switchTo().window(PWindow);
		driver.close();
		driver.quit();		

}
}
