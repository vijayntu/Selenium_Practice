package WD_Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Auto_Airasia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.airasia.com/in/en/home.page");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.findElement(By.id("fromInput")).sendKeys("che");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("fromFlyoutBody"))));
		List <WebElement> autocomplete = driver.findElement(By.id("fromFlyoutBody")).findElements(By.tagName("li"));
		
		for (WebElement sample : autocomplete)
		{
			System.out.println("Countries ==>" +sample.getText());
			if (sample.getText().contains("Chennai"))
			{
				sample.click();
				break;
			}
			
		}
		
	}

}
