package seleniumTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class LogingFunctionTest {
	
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
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
		driver.get("https://www.facebook.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		@SuppressWarnings({ "deprecation", "unused" })
		// Manage Timeout
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	}
	public static void runTest() {
		// Enter Email
		driver.findElement(By.name("email")).sendKeys("asdc@gmail.com");

		//Enter Password
		driver.findElement(By.name("pass")).sendKeys("01717511288@mk");

		// Enter Login Button
		driver.findElement(By.name("login")).click();
		
		// Get confirmation message
		String confMessage=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/form/div/div[2]/div/div/div/span[2]")).getText();
		
		// Print Current URL
		String URL = driver.getCurrentUrl();
		
		System.out.println("The Comformation Message:" + confMessage);
		
		System.out.println("The URL of the application is:" + URL);
		
		// view page source
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}
