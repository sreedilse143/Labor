package files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		String strReportPath = null;
		String mainReport = null;
		// TODO Auto-generated method stub
		FileUtils.copyFile(new File(strReportPath), new File(mainReport), true);
		
	}

}
