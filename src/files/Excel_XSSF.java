package files;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_XSSF {
	static String pFilePath = "\\\\aacss\\cssfiles\\QA\\Automation QFund\\Project on Sandbox\\QFX Hybrid FW_PF\\QFund_Test Data\\QFund_Config.xlsx";
	static XSSFCell value;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		FileInputStream fs = new FileInputStream(pFilePath);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		int number = wb.getNumberOfSheets();
		System.out.println(number);
		
		XSSFSheet ws = wb.getSheetAt(0);

		FormulaEvaluator form = wb.getCreationHelper().createFormulaEvaluator();
		value = wb.getSheetAt(0).getRow(1).getCell(1);
		for (Row rw : ws) {
			for (Cell cell : rw) {
				switch (form.evaluateInCell(cell).getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
				}
			}
		}
		fs.close();
		wb.close();
	}
}
