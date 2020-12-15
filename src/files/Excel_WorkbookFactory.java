package files;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Excel_WorkbookFactory {

	static String pFilePath = "\\\\aacss\\cssfiles\\QA\\Automation QFund\\Project on Sandbox\\QFX Hybrid FW_PF\\QFund_Test Data\\QFund_Config.xlsx";
	static XSSFCell value;

	public static void main(String[] args) throws Exception {

		FileInputStream fs = new FileInputStream(pFilePath);

		// Creating a Workbook from an Excel file (.xls or .xlsx)
		Workbook wb = WorkbookFactory.create(fs);

		Excel_WorkbookFactory obj_ewf = new Excel_WorkbookFactory();

		//obj_ewf.readdummycellvalue(wb);
		//obj_ewf.readcellvalue(wb, 1, 2, 2);
		//obj_ewf.xlReader_While_Iterator_Sheet0(wb);
		obj_ewf.xlReader2_ForEach_Sheet0(wb);
		//obj_ewf.xlReader3_ForEachLambda_Sheet0(wb);
		wb.close();

	}

	public void readdummycellvalue(Workbook wb) throws Exception {

		// Sheet s=wb.getNumberOfSheets();
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		String cellValue = c.getStringCellValue();
		System.out.println(cellValue);

	}

	public void readcellvalue(Workbook wb, int s, int r, int c) throws Exception {

		String cellValue = wb.getSheetAt(s).getRow(r).getCell(c).getStringCellValue();
		System.out.println(cellValue);

	}

	public void xlReader_While_Iterator_Sheet0(Workbook wb) throws Exception {

		// Retrieving the number of sheets in the Workbook
		System.out.println("Workbook has " + wb.getNumberOfSheets());
		System.out.println("List of Sheets  : ");

		// 1. You can obtain a sheetIterator and iterate over it
		Iterator<Sheet> sheetIterator = wb.sheetIterator();
		System.out.println("Retrieving Sheets using Iterator");
		
		while (sheetIterator.hasNext()) {
			Sheet sheet = sheetIterator.next();
			System.out.println("=> " + sheet.getSheetName());
		}

		/*
		 * ==================================================================
		 * Iterating over all the rows and columns in a Sheet (Multiple ways)
		 * ==================================================================
		 */

		// Getting the Sheet at index zero
		Sheet sheet = wb.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// 1. You can obtain a rowIterator and columnIterator and iterate over
		// them
		System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();

			// Now let's iterate over the columns of the current row
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}

	}

	public void xlReader2_ForEach_Sheet0(Workbook wb) throws Exception {

		// 2. Or you can use a for-each loop
		System.out.println("Retrieving Sheets using for-each loop");
		for (Sheet sheet : wb) {
			System.out.println("=> " + sheet.getSheetName());
		}

		// Getting the Sheet at index zero
		Sheet sheet = wb.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// 2. Or you can use a for-each loop to iterate over the rows and
		// columns
		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
		for (Row row : sheet) {
			for (Cell cell : row) {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			}
			System.out.println();
		}

	}

	public void xlReader3_ForEachLambda_Sheet0(Workbook wb) throws Exception {

		// 3. Or you can use a Java 8 forEach with lambda
		System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
		wb.forEach(sheet -> {
			System.out.println("=> " + sheet.getSheetName());
		});

		/*
		 * ==================================================================
		 * Iterating over all the rows and columns in a Sheet (Multiple ways)
		 * ==================================================================
		 */

		// Getting the Sheet at index zero
		Sheet sheet = wb.getSheetAt(0);

		// Create a DataFormatter to format and get each cell's value as String
		DataFormatter dataFormatter = new DataFormatter();

		// 3. Or you can use Java 8 forEach loop with lambda
		System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
		sheet.forEach(row -> {
			row.forEach(cell -> {
				String cellValue = dataFormatter.formatCellValue(cell);
				System.out.print(cellValue + "\t");
			});
			System.out.println();
		});

	}

}
