package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/a/span[1]")));
		act.build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"))));
		driver.findElement(By.xpath("//*[@id='container']/div/div/header/div[1]/div/ul/li[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span")).click();
		act.release();
	}

}
