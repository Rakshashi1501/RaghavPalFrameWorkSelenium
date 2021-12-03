package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderForTestNG {
	WebDriver driver = null;
//	public static void main(String[] args) {
//		
//		String excelPath = "C:\\Users\\anupr\\eclipse-workspace\\SeleniumFrameWork\\excel\\data.xlsx";
//		
//		testData(excelPath, "xlsxFormate");
// }
	
	@BeforeTest
	public void setup() {

		String propertylocation = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",
				propertylocation + "\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}
	
	// step 3
	 
	@Test(dataProvider = "test1data" )
	public void test1(String UserName, String Password) {
		
		System.out.println(UserName +"|"+Password);
		
		driver.get("");
		driver.findElement(By.xpath("")).sendKeys(UserName);
		driver.findElement(By.xpath("")).sendKeys(Password);
		
		
	}
	 
	//  step 2
	@DataProvider(name = "test1data")
	
	public Object[][] getdata() {
		String excelPath = "C:\\Users\\anupr\\eclipse-workspace\\SeleniumFrameWork\\excel\\data.xlsx";
		
			Object data[][] = testData(excelPath, "xlsxFormate");
			return data;
	}
	
// step 1
	public static Object[][] testData(String excelPath, String sheetname) {

		ExcelSheetUtils exel = new ExcelSheetUtils(excelPath, sheetname); // object of previous class

		int row = exel.getRowCount();
		int col = exel.getcolCount();

		// Creating an object arrey

		Object data[][] = new Object[row - 1][col]; // row -1 because rows start with zero and 1st row is header

		for (int i = 1; i < row; i++) {// i = 1 because first row is User name and password
			for (int j = 0; i < col; j++) {

				String cellData = exel.getCellDataString(i, j);
				System.out.print(cellData + " |");

				data[i - 1][j] = cellData;

			}
			System.out.println();

		}
		return data;
	}

}
