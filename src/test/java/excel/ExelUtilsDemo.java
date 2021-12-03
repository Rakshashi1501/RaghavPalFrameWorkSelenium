package excel;

public class ExelUtilsDemo {

	public static void main(String[] args) {
		
		
		String projectpath = System.getProperty("user.dir");
		// // we are creating object of ExcelSheetUtils class and it has constructor as string variables ie, (String excelPath, String sheetname)
		ExcelSheetUtils exel = new ExcelSheetUtils(projectpath+"\\excel\\data.xlsx", "xlsxFormate");

		exel.getRowCount();
		exel.getCellDataNumeric(0, 1);
		exel.getCellDataString(0, 0);
	}

}
