package FastJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class daraz {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		SetBrowser();
		RunTest();

	}
	
	public static void SetBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		
	}
	
	public static void RunTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("01717511288");
		driver.findElement(By.xpath("//input[@placeholder='Verification Code']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters with a number and a letter']")).sendKeys("01717511288");
		driver.findElement(By.xpath("//span[@id='month']//span[@class='next-select-inner']")).click();
		driver.findElement(By.xpath("//li[@value='2']")).click();
		Thread.sleep(5000);
		
		WebElement drop =driver.findElement(By.xpath("//span[@id='day']"));
		drop.click();
		driver.findElement(By.xpath("(//li[@value='2'])[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Year')]")).click();
		driver.findElement(By.xpath("(//li[@value='2022'])[1]")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Select')]")).click();
		driver.findElement(By.xpath("//li[@value='male']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("Moin Khan");
		
		driver.findElement(By.xpath("//button[normalize-space()='SIGN UP']")).click();
		
	}

}
