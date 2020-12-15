package files;

import java.util.ArrayList;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Excell_fillo {
	static String pExcelPath = "E:\\Selenium\\SeleniumWorkSpace\\Testdata\\QFund_Config.xlsx";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection(pExcelPath);
		String strQuery = "Select CONFIG_NAME from Config";
		Recordset recordset = connection.executeQuery(strQuery);
		ArrayList<String> aField = recordset.getFieldNames();
		recordset.moveFirst();
		for (int i = 0; i < aField.size() - 1; i++) {
			System.out.print(recordset.getField(aField.get(i)) + "\t");
		}
		recordset.moveNext();
		recordset.close();
		connection.close();

	}

}
