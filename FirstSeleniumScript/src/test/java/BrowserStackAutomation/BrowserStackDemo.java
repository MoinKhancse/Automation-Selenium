package BrowserStackAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStackDemo {
	public static final String Username = "animeshroy_LXsWQd";
	public static final String AccessKey = "9xJLx9sX3rnreq8gzUeq";
	static WebDriver driver;
	public static final String URL = "https://"+Username +":" + AccessKey + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		SetBrowser();
		RunTest();
	}
	public static void SetBrowser() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version","11");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "Sample Test"); //Test Name
		caps.setCapability("build", "Build Number 1.0.0");
		
		WebDriverManager.chromedriver().setup();
		try {
			driver = new RemoteWebDriver(new URL(URL),caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	public static void RunTest() {
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	}

}
