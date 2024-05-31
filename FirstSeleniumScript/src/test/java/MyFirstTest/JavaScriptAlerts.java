package MyFirstTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	public static void RunTest() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//Alert handle with ok and cancel button
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept(); //ok
		
		driver.switchTo().alert().dismiss(); // cancle
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alertwindow = driver.switchTo().alert();
		alertwindow.sendKeys("selenium");
		alertwindow.accept();
	}
	

}
