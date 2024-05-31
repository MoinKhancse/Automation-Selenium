package BrowserStackAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebBrowser();
		RunTest();

	}
	public static void WebBrowser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	public static void RunTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById('APjFqb').value='Selenium';");
		//Scroll to bottom
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//Navigate different page
		//js.executeScript("window.location='url'");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(Keys.RETURN);
		WebElement btn = driver.findElement(By.cssSelector("//button[normalize-space()='Login']"));
		js.executeScript("arguments[0].click();",btn);
	}

}
