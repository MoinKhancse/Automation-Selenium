package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
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

		System.setProperty("webdriver.chrome.driver","C:\\win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// Navigate to webSite
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		@SuppressWarnings({ "deprecation", "unused" })
		// Manage Timeout
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);	
	}
	
	public static void runTest() throws Exception {
		Thread.sleep(3000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a")).click();
			
		}

}
