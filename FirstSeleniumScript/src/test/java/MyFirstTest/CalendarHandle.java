package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com/Default.aspx");
		
	}
	public static void RunTest() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.className("ui-state-highlight")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("ctl00$mainContent$view_date2")).click();
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[8]")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00$mainContent$ddl_Adult")).click();
		
	}

}
