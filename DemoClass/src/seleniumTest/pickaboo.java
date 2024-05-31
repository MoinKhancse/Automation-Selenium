package seleniumTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class pickaboo {
	
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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		@SuppressWarnings({ "deprecation", "unused" })
		// Manage Timeout
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	}
	public static void runTest() {
		// Enter Email
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[2]/div/center/div/form/div/div[5]/p/a/span")).click();

		//Enter Password
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[1]/div/input")).sendKeys("Moin");

		// Enter Login Button
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[2]/div/input")).sendKeys("khan");
		
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[3]/div/div/input")).sendKeys("");
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[4]/div/input")).sendKeys("");
		
		//driver.findElement(By.xpath("/html/body/div[2]/main/div/div[2]/div/div[3]/div/center/div/form/div/div[5]/button/span[1]")).click();
		// Get confirmation message
		//String confMessage=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/form/div/div[2]/div/div/div/span[2]")).getText();
		
		// Print Current URL
		//String URL = driver.getCurrentUrl();
		
		//System.out.println("The Comformation Message:" + confMessage);
		
		//System.out.println("The URL of the application is:" + URL);
		
		// view page source
		//String pageSource=driver.getPageSource();
		//System.out.println(pageSource);
	}

}
