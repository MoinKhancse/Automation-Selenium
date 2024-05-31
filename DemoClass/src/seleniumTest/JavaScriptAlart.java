package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlart {
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		setBrowser();
		browserConfig();
		runTest();
	}
	public static void setBrowser() {
		browser = "chrome";
	}
	public static void browserConfig() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
				
		// Navigate to webSite
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		
		@SuppressWarnings({ "deprecation", "unused" })
		// Manage Timeout
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	}
	public static void runTest() throws Exception {
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		// driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alertWindows= driver.switchTo().alert();
		System.out.println(alertWindows.getText());
		
		alertWindows.sendKeys("Selenium");

		Thread.sleep(3000);
		alertWindows.accept();
		
	}


}
