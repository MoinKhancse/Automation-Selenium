package FastJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
	}
	public static void RunTest() {
		driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("moinkhan.wubcse@gmail.com");
		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("01717511288");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		String u = driver.getCurrentUrl();
		if(u.equals("https://www.linkedin.com/feed/?trk=homepage-basic_sign-in-submit")) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Tast Case Faild");
		}
	}

}
