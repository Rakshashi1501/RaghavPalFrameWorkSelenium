import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		// As we have added drivers in our project, we can write the following statements.
		
		String  projectPath =System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+ "\\driver\\chromedriver_win32\\chromedriver.exe" );
		//System.setProperty("webdriver.gecko.driver", projectPath +"\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.co.in/");
		
		
		
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello");

		//WebElement element = driver.findElement(By.xpath("//input[@title='Search']"));
		
		//element.sendKeys("abcde");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listOfInputElements.size();
		
		System.out.println(" Count of elements: "+ count);
		
		driver.close();
		driver.quit();
		
	}

}
