package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_MultiFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//driver.switchTo().frame("iframeResult");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));
		
		Select sel = new Select(driver.findElement(By.name("cars")));
		sel.selectByIndex(1);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL);
		act.build().perform();
		sel.selectByIndex(3);
		act.release();
		
		driver.switchTo().defaultContent();
	}

}
