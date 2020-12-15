package files;

import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.codoid.products.fillo.Recordset;

public class Excel_JDBC_ODBC {

	static String pFilePath = "\\\\aacss\\cssfiles\\QA\\Automation QFund\\Project on Sandbox\\QFX Hybrid FW_PF\\QFund_Test Data\\QFund_Config.xlsx";

	final static String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	final static String DATABASE_URL = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};DBQ=%s;DriverID=22;READONLY=false";

	public static void main(String[] args) throws Exception {
		new Excel_JDBC_ODBC().jdb1(pFilePath);
	}


	public void jdb1(String pFilePath) throws Exception {
		File file = new File(pFilePath);
		Class.forName(DRIVER_NAME);
		java.sql.Connection connection = DriverManager.getConnection(String.format(DATABASE_URL, file.getAbsolutePath()));

		Statement stmt = connection.createStatement();
		ResultSet recordset = stmt.executeQuery("SELECT * FROM [Config$] where CONFIG_NAME='QA1_CSR'");
		ArrayList<String> aField = ((Recordset) recordset).getFieldNames();
		recordset.beforeFirst();

		for (int i = 0; i < aField.size() - 1; i++) {
			System.out.print(((Recordset) recordset).getField(aField.get(i)) + "\t");
		}

	}

}
