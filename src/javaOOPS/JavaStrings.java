package javaOOPS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String asd = RandomStringUtils.randomAlphabetic(2) + RandomStringUtils.randomNumeric(6)
				+ RandomStringUtils.randomAlphabetic(2);
		System.out.println(asd);

	}

	public String getTempFolderPath() throws IOException {
		File temp = File.createTempFile("temp-file-name", ".tmp");
		String absolutePath = temp.getAbsolutePath();
		String tempFilePath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
		return tempFilePath;
	}

	/*
	 * Length
	 * 
	 */

	/*
	 * Substring
	 */

	/*
	 * Upper case
	 */

	/*
	 * Lower case
	 */

	/*
	 * IsEmpty
	 */

	/*
	 * contains
	 */

	/*
	 * equalsIgnoreCase
	 */

	/*
	 * String recverese
	 * 
	 */

	public static void StringReverese() {
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}

	/*
	 * Date and Time
	 */

	/*
	 * Split
	 */

	/*
	 * Random
	 */

}
