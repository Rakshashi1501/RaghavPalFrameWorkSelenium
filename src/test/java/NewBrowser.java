import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBrowser {

	public static void main(String[] args) {
		
		// This is using WebDriverManager dependencies added through maven in pom.xml

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.0.3");

	}

}
