package TestSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

public class RunTest extends BaseDriver{
	@BeforeTest 
	public void regation() {
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd");
		driver.findElement(By.xpath("")).click();
		
		
	}

}
