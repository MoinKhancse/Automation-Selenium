package MyFirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
	}
	public static void RunTest() {
		driver.get("https://www.spicejet.com/");
		
	}

}
