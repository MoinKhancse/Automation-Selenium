package MyFirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		BrowserConfig();
		RunTest();
	}
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://in.via.com/hotels");
		
	}
	public static void RunTest() throws InterruptedException {
		driver.findElement(By.id("destination")).sendKeys("lon");
		Thread.sleep(3000);
		
		List<WebElement> locations = driver.findElements(By.xpath("//li[@class='ui-menu-item']//span"));
		
		for(WebElement location : locations) {
			if(location.getText().equalsIgnoreCase("Londrina,BR,Brazil"));
			location.click();
			break;
		}
	}

}
