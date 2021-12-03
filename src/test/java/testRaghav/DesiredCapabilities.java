package testRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilities {
	
	// Not all server implementations will support every WebDriver feature.
	//Therefore, the client and server should use JSON objects with the properties, when describing which features a user requests that a session support  

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		
		// using this object is can set Desired capabilities
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
	}

}
