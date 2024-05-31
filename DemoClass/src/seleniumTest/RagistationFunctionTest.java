package seleniumTest;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RagistationFunctionTest {
	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
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

		// Manage Timeout
		
		@SuppressWarnings("unused")
		var implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	public static void runTest() {

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Moin");
		driver.findElement(By.name("lastname")).sendKeys("khan");
		driver.findElement(By.name("reg_email__")).sendKeys("moinkhan@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("moinkhan@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("01717511288@mk");
		
		new Select(driver.findElement(By.name("birthday_day"))).selectByIndex(20);
		new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Oct");
		new Select(driver.findElement(By.name("birthday_year"))).selectByValue("2000");
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		driver.findElement(By.name("websubmit")).click();
		
				
		String confMessage=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/div[1]")).getText();
		System.out.println("The Message:" + confMessage);
		
		String URL = driver.getCurrentUrl();
		System.out.println("The URL of the application is:" + URL);
	}

}
