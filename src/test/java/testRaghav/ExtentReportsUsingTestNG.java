package testRaghav;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsUsingTestNG {

	private static WebDriver driver = null;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;

	// @BeforeTest // setUp() function will run before every test so if we have
	// multiple test cases it will run multiple times.

	@BeforeSuite // it runs only ones, no matter what how many test cases are there.
// Runs before Test has run
	public void setUp() {

		htmlreporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}

	@BeforeTest
	public void setupTest() {

		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	// code for first test case

	public void test1() throws Exception {

		ExtentTest test = extent.createTest("Google search test 1", "Test to validate google search functionality ");

		driver.get("https://www.google.co.in/");
		test.pass("Navigate to google");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");

		test.pass("Entered text in search box");

		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.RETURN);
		test.pass("Entered Search key");

		// log (status, details) , this step shows user into log(status details)

		test.log(Status.INFO, "This step shows user into log(status derails)");

		// info details

		test.info("This step shows user in info details");

		// log with snapshot

		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("Screenshot.png").build());

		// test with snapshot

		test.addScreenCaptureFromPath("Screenshot.png");

	}

	@AfterTest

	public void teardownAfterTest() {

		driver.close();

		driver.quit();
	}

	// @ AfterTest // tearDown() function will run After every test so if we have
	// multiple test cases it will run multiple times.
	// Runs After Test has run

	@AfterSuite // // it runs only ones, no matter what how many test cases are there.
	public void tearDown() {

		extent.flush();
		
		System.out.println("Test successful");
	}
}
