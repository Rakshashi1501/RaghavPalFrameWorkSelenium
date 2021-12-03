package testRaghav;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicEX {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreports.html");

		// To enable or start a reporter, use attachReporter:
		// Create Extentreports and attach reporter(s)

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);

		// To create tests, use createTest. This method returns a ExtentTest object.
		// Create a toggle for the given test, add log events under it

		/*
		 * test.log(Status.PASS, "pass"); test.pass("pass");
		 * 
		 * test.log(Status.FAIL, "fail"); test.fail("fail");
		 */

		ExtentTest test1 = extent.createTest("Google search test 1", "Test to validate google search functionality ");

		// by using test1 we can log all statements
		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		test1.log(Status.INFO, "Start test case");

		driver.get("https://www.google.co.in/");
		test1.pass("Navigated to google");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		test1.pass("Entered text in search box");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test1.pass("Entered Search key");

		driver.close();

		driver.quit();

		test1.pass("Closed windows");
		

		test1.pass("Test completed");
		
		// After completing we have to flush the reports otherwise we dont see any error in program but report willNOT be created
		// calling flush writes everything to the log file 
		
		extent.flush();
		
		System.out.println("Test successful");

	}

}
