package testRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		GoogleSearch();

	}

	public static void GoogleSearch() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		// driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation
		// step by step");

		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");

		// Send keys is for keys to be pressed from keyboard and Return is for Enter key
		// driver.findElement(By.xpath("//div[@class='FPdoLc
		// lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("//input[@name='btnK']")).click();

		driver.close();

		System.out.println("Test successful");

		driver.quit();
	}

}
