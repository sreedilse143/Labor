package windows_executables;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class Clipboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void ClipBoard() throws AWTException {
		String strFilepath = "asd";
		StringSelection selection = new StringSelection(strFilepath);
		java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);

	}

}
