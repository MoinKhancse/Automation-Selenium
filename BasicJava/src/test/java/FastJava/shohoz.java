package FastJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shohoz {
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		RunTest();
		

	}
	public static void setBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
	}
	public static void RunTest() {
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("Shohoz");
		searchBox.submit();
		driver.findElement(By.xpath("//div[@class='notranslate HGLrXd NJjxre iUh30 ojE3Fb']//div[@class='q0vns']//div[@class='CA5RN']//div//span[@class='VuuXrf'][normalize-space()='Shohoz']")).click();
		driver.findElement(By.xpath("//a[@title='Bus']")).click();
		driver.findElement(By.xpath("//input[@id='dest_from']")).sendKeys("Dhaka");
		driver.findElement(By.xpath("//input[@id='dest_to']")).sendKeys("Khulna");
		driver.findElement(By.xpath("//div[@class='block col-md-6 px-sm-0']//div[1]//div[1]//img[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Search Buses']")).click();
		driver.findElement(By.xpath("//button[@id='12668578']")).click();
	}

}
