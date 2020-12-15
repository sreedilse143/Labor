package javaOOPS;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.RandomStringUtils;

public class JavaStringsAdv {

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

	/*
	 * StringFormat
	 */

	public static void StringFormat() throws ParseException {
		double e = Math.E;
		System.out.format("%f%n", e);
		System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);
		String name = "Hello World";
		String s1 = String.format("name %s", name);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

		// get current date time with Date()
		Date date = new Date();

		// Now format the date
		String strSystemDate = dateFormat.format(date);

		String strdate = "11.11.2012";
		SimpleDateFormat sdtF = new SimpleDateFormat("dd.mm.yyyy", Locale.GERMANY);
		Date dareFormatiert = sdtF.parse(strdate);

	}

	/*
	 * StringBuffer
	 */

	public static void java_StringBuffer() {
		String mystr = "Hello";
		int myStrlength = new StringBuffer(mystr).length();
		StringBuffer myStrappend = new StringBuffer(mystr).append("appendtext");
		StringBuffer myStrreverse = new StringBuffer(mystr).reverse();
		StringBuffer myStrinsert = new StringBuffer(mystr).insert(0, "insert");
		StringBuffer myStrdeleteCharAt = new StringBuffer(mystr).deleteCharAt(1);

	}

}
