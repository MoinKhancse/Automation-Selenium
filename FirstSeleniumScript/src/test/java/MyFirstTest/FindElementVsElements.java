package MyFirstTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class FindElementVsElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		BrowserConfig();
		RunTest();

	}
	public static void BrowserConfig() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/hotels");
	}
	public static void RunTest() {
		//findElement() - return single element
		
		//case-01
		//WebElement search =driver.findElement(By.name("destination"));	
		//search.sendKeys("USA");
		
		//case-02
		
		//WebElement links = driver.findElement(By.xpath("//div[@class='footer']//a"));
		//System.out.println(links.getText());
		
		//case-03
		//WebElement element = driver.findElement(By.xpath("//img[@title='Rajasthan']"));
		//element.click();
		
		//findElements() - return multiple element
		//case-01
		 List <WebElement> links = driver.findElements(By.xpath("//div[@class='footer']//a"));
		 System.out.println("Total Footer Links are :" +links.size());
		 
		 
		for(WebElement element : links) {
			System.out.println(element.getText());
		}
		
		//case-02
		List <WebElement> logo = driver.findElements(By.xpath("//img[@class='ebixcashLogo u_vertAlignBtm u_borderRight u_padR10 u_htauto u_bRgrey']"));
		System.out.println(logo.size());
		
		//case-03
		List <WebElement> element = driver.findElements(By.xpath("//span[normalize-space()='Flight']"));
		System.out.println(element.size());
		
		
	}

}
