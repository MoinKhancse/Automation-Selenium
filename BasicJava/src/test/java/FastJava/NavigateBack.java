package FastJava;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBack {
	static WebDriver driver;

	public static void main(String[] args) {
		SetBrowser();
		RunTest();

	}
	public static void SetBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.com");
		
	}
	public static void RunTest() {
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
