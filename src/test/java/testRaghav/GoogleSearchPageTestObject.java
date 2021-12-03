package testRaghav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.GoogleSearchPageObject;

public class GoogleSearchPageTestObject {
	
	 private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearchtext();
	}
	
	public static void googleSearchtext() {
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver); // we have to add the object of private driver 
		
		// From here actual test starts 
		
		driver.get("https://www.google.co.in/");
		
		searchPageObj.setTextinInbox(" A B C D");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
		
		System.out.println("Test Successful ");
		
	}
}
