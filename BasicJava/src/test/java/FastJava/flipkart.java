package FastJava;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static WebDriver driver;

	public static void main(String[] args) {
		SetBrowser();
		RunTest();

	}
	public static void SetBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
	}
	public static void RunTest() {
//		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).
//		sendKeys("iphone 15 plus");
//		
//		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).
//		sendKeys(Keys.ENTER);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		searchBox.sendKeys("iphone 15 plus");
		searchBox.submit();
		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Plus (Blue, 128 GB)']")).click();
		
	}

}
