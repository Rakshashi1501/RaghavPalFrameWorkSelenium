package testRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_googleSearch_Demo2 {

	WebDriver driver = null;

	// We dont have main method in testNG
	// to customise what to run, we use testNG.xml file

	@BeforeTest
	public void setup() {

		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}
@Test
	public void GoogleSearch2() {

		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		// Send keys is for keys to be pressed from keyboard and Return is for Enter key
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);

		// driver.findElement(By.xpath("//input[@name='btnK']")).click();

	}
@AfterTest

	public void teardown() {

		driver.close();

		driver.quit();

		System.out.println("Test successful");

	}

}
