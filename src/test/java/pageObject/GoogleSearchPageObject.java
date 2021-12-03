package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class GoogleSearchPageObject {

	  WebDriver driver = null;  // Here we used driver so when we call it from a test case, 
	  
	  // we should be using driver instance from test case but not this one otherwise it testcase drive wont do any action.
	  
	  // for that we create a constructor.
		
	By textBox_Search = By.xpath("//input[@title='Search']");
	By button_Search = By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
	
	// Creation of constructor
	
	public GoogleSearchPageObject(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void setTextinInbox(String text) {
	
		driver.findElement(textBox_Search).sendKeys(text);;
	}
	
	public  void clickSearchButton() {
		driver.findElement(button_Search).sendKeys(Keys.RETURN);
	}

	

}
