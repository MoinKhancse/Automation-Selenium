package TestSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	
	@BeforeTest
	public void Open_Url() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		Thread.sleep(5000);	
		System.out.println("Before Test");
	}
	@Test(priority=2)
	public void Login() {
		System.out.println("test 1");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
			
	}
	@Test(priority=1)
	public void SignUp() throws InterruptedException {
		System.out.println("test 2");
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("01717511288");
		driver.findElement(By.xpath("//input[@placeholder='Verification Code']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters with a number and a letter']")).sendKeys("01717511288@Mk");
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Month')]")).click();
		driver.findElement(By.xpath("//li[@value='2']")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Day')]")).click();
		driver.findElement(By.xpath("//li[@value='4']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Year')]")).click();
		driver.findElement(By.xpath("//li[@value='2023']")).click();
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'Select')]")).click();
		driver.findElement(By.xpath("//li[@value='male']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("Moin Khan");
		driver.findElement(By.xpath("//button[normalize-space()='SIGN UP']")).click();
		
		Thread.sleep(5000);	
	}
}
