package headlessBrrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	WebDriver driver = null;

	public void openheadlessBrowser() {
		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");

		// This object is for headless browser access
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("Headless arguments");

		driver = new ChromeDriver(options);

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		System.out.println("test completed");
		
		driver.close();

		driver.quit();
	}
}