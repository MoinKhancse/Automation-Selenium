package MyFirstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDragAndDrop {
	static WebDriver driver;

	public static void main(String[] args) {
		SetBrowser();
		RunTest();
		

	}
	public static void SetBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	}
	public static void RunTest() {
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement element1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement element2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions a = new Actions(driver);
		
		a.dragAndDrop(element1, targetElement).build().perform();
		a.dragAndDrop(element2, targetElement).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//li[@id='menu-item-1513']//a[normalize-space()='Home']")).click();
	}

}
