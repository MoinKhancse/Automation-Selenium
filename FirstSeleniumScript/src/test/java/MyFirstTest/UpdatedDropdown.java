package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunFast();

	}
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
	}
	public static void RunFast() throws InterruptedException {
		driver.findElement(By.id("ptravlrNo")).click();
		
//		int i=1;
//		while(i<6){
//			driver.findElement(By.id("add")).click();
//			i++;
//		}
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("add")).click();
			Thread.sleep(1000);
		}
		driver.findElement(By.id("traveLer")).click();
	}
	

}
