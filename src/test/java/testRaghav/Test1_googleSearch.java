package testRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_googleSearch {

	public static void main(String[] args) {

		GoogleSearch();

	}

	public static void GoogleSearch() {

		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		// Send keys is for keys to be pressed from keyboard and Return is for Enter key
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("//input[@name='btnK']")).click();

		driver.close();

		System.out.println("Test successful");

		driver.quit();
	}

}
