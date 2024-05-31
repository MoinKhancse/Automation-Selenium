package MyFirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplecitWait {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserConfig();
		RunTest();
	}
	public static void BrowserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	public static void RunTest() {
		//WebDriverWait explWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
		
		By loc = By.xpath("//a[@href='https://www.selenium.dev/']");
		waitforElement(driver,loc,5).click();
		
		//WebElement element = explWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")));
		//element.click();
	}
	public static WebElement waitforElement(WebDriver driver, By locator, int timeout) {
		
		WebDriverWait explWait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		explWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
		
	}

}
