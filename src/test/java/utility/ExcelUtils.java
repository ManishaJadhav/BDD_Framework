package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void Write(int num, String status, String actual) throws Exception {

		File src = new File("D:\\final_framework\\testData\\TestData.xlsx");

		FileInputStream fis = new FileInputStream(src);

		// load the workbook
		XSSFRow row = null;
		XSSFCell cell;

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
		// int num = 1;
		row = sh1.getRow(num);
		cell = row.createCell(1);
		cell.setCellValue(actual);

		cell = row.createCell(2);
		cell.setCellValue(status);

		// here we need to specify where you want to save file

		FileOutputStream fout = new FileOutputStream(
				new File("D:\\final_framework\\testData\\TestData.xlsx"));

		// finally write content 

		wb.write(fout);

		// close the file

		fout.close();

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		File src = new File(Constant.Path_TestData + Constant.File_TestData1);

		FileInputStream fis = new FileInputStream(src);
		String CellData = null;
		//XSSFRow row = null;
		XSSFCell cell;

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
		try {

			cell = sh1.getRow(RowNum).getCell(ColNum);
			if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
				CellData = cell.getStringCellValue();
				return CellData;
			} else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
				int i = (int) cell.getNumericCellValue();
				return String.valueOf(i);

			} else {
				CellData = cell.getRawValue();
			}
			return CellData;
			// System.out.println(CellData);
		} catch (Exception e) {
			return "";
		}

	}
}