package excel;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetUtils {

	static String projectpath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	// for xsl files
	// HSSFWorkbook workbook = new HSSFWorkbook();
	// For writing values of rows and coloumn, we use constructor
	public ExcelSheetUtils(String excelPath, String sheetname) {

		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0, 0); // when (int rowNum, int coloumNum) are added in method, we can directly give it
									// here
		getCellDataNumeric(0, 1);
	}

	public static int getRowCount() {

		// for xslx file
		int rowcount = 0;
		try {

			// ******
			rowcount = sheet.getPhysicalNumberOfRows();

			System.out.println("The number of rows:" + rowcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rowcount;

	}

	// Get cell Data

	public static String getCellDataString(int rowNum, int coloumNum) {
		String celldata = null;
		try {
			// We have created constructor, we donot want this
			/*
			 * projectpath =System.getProperty("user.dir"); workbook = new XSSFWorkbook(
			 * projectpath +"\\excel\\data.xlsx"); XSSFSheet sheet =
			 * workbook.getSheet("xlsxFormate");
			 */

			// ******

			celldata = sheet.getRow(rowNum).getCell(coloumNum).getStringCellValue();
			System.out.println(celldata);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return celldata;

	}

	public static void getCellDataNumeric(int rowNum, int coloumNum) {

		try {

			// We have created constructor, we donot want this
			/*
			 * projectpath =System.getProperty("user.dir"); workbook = new XSSFWorkbook(
			 * projectpath +"\\excel\\data.xlsx"); XSSFSheet sheet =
			 * workbook.getSheet("xlsxFormate");
			 */

			// ******
			// we are hard coding the row number and coloumn number, its a bad practice

			double celldata = sheet.getRow(rowNum).getCell(coloumNum).getNumericCellValue();
			System.out.println("The cell data is :" + celldata);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static int getcolCount() {

		// for xslx file
		int colcount = 0;
		try {

			// ******
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();

			System.out.println("The number of col:" + colcount);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return colcount;
	}
}
