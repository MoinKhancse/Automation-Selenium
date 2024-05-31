package MyFirstTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLHandaling {
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
	}
	public static void RunTest() {
		System.out.println(driver.getTitle());
		
	}

}
