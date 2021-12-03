package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExplicitWait {
	private static WebDriver driver = null;
public static void main(String[] args) {
	seleniumExplicitWaits();
}

	public static void seleniumExplicitWaits() {
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("abcdef")));
		
		
		driver.findElement(By.xpath("Hello")).sendKeys("Hei");

		driver.close();

		driver.quit();
}
}