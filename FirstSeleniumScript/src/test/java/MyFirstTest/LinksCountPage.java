package MyFirstTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksCountPage {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebBrowser();
		RunTest();
	}
	public static void WebBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.cypress.io/guides/overview/why-cypress");
		
	}
	public static void RunTest() throws InterruptedException {
		int link =driver.findElements(By.tagName("a")).size();
		//Total Link Findout
		System.out.println(link);
		//Total Link on the footer
		WebElement footerDriver = driver.findElement(By.xpath("//footer[@class='footer footer--dark']"));		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement colomDriver = footerDriver.findElement(By.xpath("(//div[@class='col footer__col'])[1]"));
		System.out.println(colomDriver.findElements(By.tagName("a")).size());
		
		WebElement colDriver = footerDriver.findElement(By.xpath("(//div[@class='col footer__col'])[4]"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());
		int a = colomDriver.findElements(By.tagName("a")).size();
		for(int i = 0; i<a; i++) {
			String OnClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			colomDriver.findElements(By.tagName("a")).get(i).sendKeys(OnClick);
			Thread.sleep(3000);
		}
		
		//get title of each child tabs
		
		Set <String> windows = driver.getWindowHandles();
		Iterator <String> it = windows.iterator();
		
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("This is Title" + driver.getTitle());
			
		}
	}

}
