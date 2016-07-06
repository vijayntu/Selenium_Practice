package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tooltip_MultiFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("age")));
		act.build().perform();
		String tooltip = driver.findElement(By.cssSelector(".ui-tooltip")).getText();
		System.out.println(tooltip);
		act.release();
	}

}
