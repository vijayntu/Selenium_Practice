package WD_Training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tooltip_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:/Selenium/Docs/Webdriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org");
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		String tooltip = driver.findElement(By.cssSelector("#header h1 >a")).getAttribute("title");
		
		System.out.println("Tooltip is ==>" + tooltip);
		
	}

}
