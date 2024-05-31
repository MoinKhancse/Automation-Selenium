package MyFirstTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	public static void RunTest() {
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Selenium'])[1]")).click();
	}

}
