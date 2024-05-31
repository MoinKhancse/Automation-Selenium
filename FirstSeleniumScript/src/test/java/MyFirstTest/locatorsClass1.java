package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsClass1 {
	//static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		//setBrowser();
		browserConfig();
		runTest();
	}
	
//	public static void setBrowser() {
//		browser = "chrome";	
//	}
	public static void browserConfig() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	public static void runTest() {	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		
	}
	

}
