package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		
	}
	public static void RunTest() {
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.name("field-keywords"))).click()
		                            .keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		
		WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		action.moveToElement(element).contextClick().build().perform();
		
		
	}

}
