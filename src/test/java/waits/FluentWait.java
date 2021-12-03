package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;



public class FluentWait {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		fluentwaitdemo();
	}

	public static void fluentwaitdemo() throws Exception {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkElement = driver.findElement(By.linkText("Running an automation manually - AWS Systems Manager"));
				
				if(linkElement.isEnabled()) {
					
					System.out.println("element found" + driver.getTitle());
					
				}
				return linkElement;
			}
		});
		element.click();
		
			  
	//	driver.findElement(By.linkText("Running an automation manually - AWS Systems Manager")).click();

		Thread.sleep(3000);

		driver.close();

		driver.quit();
	}
}