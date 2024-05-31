package MyFirstTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemowindowHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();
	}
	public static void BrowserConfig() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
		
	}
	public static void RunTest() {
		//String windowID = driver.getWindowHandle();
		//System.out.println(windowID);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> winwodsID = driver.getWindowHandles();
		//iterator()
		Iterator <String> it = winwodsID.iterator();
		String parentID = it.next();
		String childID = it.next();
		System.out.println("Parent window ID"+parentID);
		System.out.println("Child window ID"+childID);
		
		
		 
	}

}
