package testNgMultiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo {
	
	private static WebDriver driver = null;
	
	String projectPath = System.getProperty("user.dir");
	
	
	// We can give parameters for browsername
	// Parameter name is given in xml file testng3.xml
	
	@Parameters("browsername")
	@BeforeTest
	public void setUp(String browsername) {
		
		
		System.out.println("Browser name : " + browsername );
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("Thread count: " + Thread.currentThread().getId());
		
	}
		else if(browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\driver\\chromedriver_win32\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\driver\\chromedriver_win32\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws Exception {
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(4000);

	}
	
	@AfterTest
	public void tearDown() {
		driver.close();

		driver.quit();
		
		System.out.println("Test successful");
		
	}
}
