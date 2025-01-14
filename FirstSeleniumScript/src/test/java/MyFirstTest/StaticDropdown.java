package MyFirstTest;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		browserConfig();
		runTest();
	}
	public static void browserConfig() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/hotels");
	}
	public static void runTest() throws InterruptedException {	
		WebElement staticDropdown = driver.findElement(By.id("nationalityCountry"));
		Select dropdown = new Select(staticDropdown);
		
		//selectByIndex
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		//selectByValue
		dropdown.selectByValue("165168");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		//selectByVisibleText
		dropdown.selectByVisibleText("United Kingdom");
		System.out.println(dropdown.getFirstSelectedOption().getText());
	}

}
