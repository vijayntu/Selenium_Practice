package WD_Training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());		
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		if(alert.getText().contains("Origin"));
		{
			alert.accept();
		
		}
	}

}
