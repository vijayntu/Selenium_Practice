package WD_Training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Newtours_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.name("userName"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement IButton = driver.findElement(By.name("login"));
		
		userName.sendKeys("vijay.a");
		password.sendKeys("vijay123");
		IButton.click();
		Thread.sleep(3000);
		
		//FluentWait wait1 = new FluentWait(driver).withTimeout(10, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS);
		
		
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("tripType"))));
		
		List <WebElement> Type = driver.findElements(By.name("tripType"));
		String value = Type.get(1).getAttribute("value");
		System.out.println(value);
		Type.get(1).click();
		
		Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByValue("3");
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]/td/font")).getText());
				
		driver.findElement(By.partialLinkText("ITINER")).click();
	}

}
