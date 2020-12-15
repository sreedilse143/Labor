package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class ReadWrite_CSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void updateCSV(String filePath, String valueToBeUpdated, String dataName, String columnName)
			throws Exception {

		int row = findRowNumberCSV(filePath, columnName);
		int col = findColumnNumberCSV(filePath, columnName);
		File inputFile = new File(filePath);

		// Read existing file
		CSVReader reader = new CSVReader(new FileReader(inputFile));
		List<String[]> csvBody = reader.readAll();

		// get CSV row column and replace with by using row and column
		csvBody.get(row)[col] = valueToBeUpdated;
		reader.close();

		// Write to CSV file which is open
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile));
		writer.writeAll(csvBody);
		writer.flush();
		writer.close();
	}

	public static List<LinkedHashMap<String, String>> ReadCSV_getRowDataForRowName(String filePath, String dataName)
			throws Exception {
		List<LinkedHashMap<String, String>> dataList = new ArrayList<LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
		CSVReader reader = null;

		reader = new CSVReader(new FileReader(filePath));
		String[] line;
		String[] columns = null;
		while ((line = reader.readNext()) != null) {
			if (columns == null) {
				columns = line;
			}
			if (dataName.equals(line[0]) || dataName.equals("Y")) {
				for (int i = 0; i <= line.length - 1; i++) {
					if (filePath.contains("Config.csv")) {
						data.put("Config_" + columns[i], line[i]);
					} else {
						data.put(columns[i], line[i]);
					}
				}
				dataList.add(data);
				if (!dataName.equals("Y") && !filePath.contains("_SUITE")) {
					break;
				}
			}
		}
		reader.close();
		return dataList;
	}

	private static Integer findColumnNumberCSV(String filePath, String colName) throws Exception {
		int colNo = 0;
		CSVReader reader = new CSVReader(new FileReader(filePath));
		String[] line = reader.readNext();
		int count = 0;
		for (String col : line) {
			if (col.equals(colName)) {
				colNo = count;
				break;
			}
			count = count + 1;
		}
		reader.close();
		return colNo;
	}

	private static Integer findRowNumberCSV(String filePath, String dataName) throws Exception {
		int rowNo = 0;
		CSVReader reader = null;

		reader = new CSVReader(new FileReader(filePath));
		String[] line;
		int count = 0;
		while ((line = reader.readNext()) != null) {
			if (dataName.equals(line[0])) {
				rowNo = count;
				break;
			}
			count = count + 1;
		}
		reader.close();
		return rowNo;
	}

}
