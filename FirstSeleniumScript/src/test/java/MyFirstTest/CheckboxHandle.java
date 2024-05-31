package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		BrowserConfig();
		RunTest();	
	}
	public static void BrowserConfig() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/");
		
	}
	
	public static void RunTest() {
		System.out.println(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$Student")).isSelected());
		
		driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$Student")).click();
		
		System.out.println(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$Student")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//div[@id='divdiscountcheckbox']//input[@type='checkbox']")).size());
		
	}

}
