package MyFirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}
	public static void RunTest() throws InterruptedException {
		
	}

}
