package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) {
		
	 element = driver.findElement(By.xpath("//input[@title='Search']"));
	
	return element;
		
	}
	public static WebElement search_button(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"));
		 return element;

	}
}
