package WD_Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_Auto_Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.findElement(By.id("lst-ib")).sendKeys("sele");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".sbdd_a"))));
		List <WebElement> autocomplete = driver.findElement(By.cssSelector(".sbdd_a")).findElements(By.tagName("li"));
		
		for(WebElement samp : autocomplete)
		{
			System.out.println("Options ==>" + samp.getText());
			if (samp.getText().contains("Selenium"))
			{
				samp.click();
				break;
			}
			
	}

	}
	}
