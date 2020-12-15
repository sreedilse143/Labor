package javapackages;

import static java.lang.System.out;

import java.lang.reflect.InvocationTargetException;
import java.util.GregorianCalendar;

import files.AAscriptdevelopmentpackclass;

public class javalang_pack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javalang_pack obj = new javalang_pack();
		obj.process_destroy();
	}

	public static void javaboolean() {

		// create a Boolean object b

		// assign value to b
		Boolean b = new Boolean(true);

		// create a boolean primitive type bool

		// assign primitive value of b to bool
		boolean bool = b.booleanValue();

		String str = "Primitive value of Boolean object " + b + " is " + bool;

		// print bool value
		System.out.println(str);
	}

	public static void java_Pasrseboolean() {

		// create and assign values to String's s1, s2
		String s1 = "TRue";
		String s2 = "yes";

		String s3 = null;

		// create 2 boolean primitives bool1, bool2
		boolean bool1, bool2;

		/**
		 * static method is called using class name apply result of parseBoolean on s1,
		 * s2 to bool1, bool2
		 */
		bool1 = Boolean.parseBoolean(s1);
		bool2 = Boolean.parseBoolean(s2);
		boolean bool3 = Boolean.parseBoolean(s3);

		String str1 = "Parse boolean on " + s1 + " coverted " + bool1;
		String str2 = "Parse boolean on " + s2 + " coverted " + bool2;

		// print b1, b2 values
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(bool3);
	}

	public static void java_boolean_toString() {

		// create 2 boolean primitives bool1, bool2
		boolean bool1, bool2;

		// assign values to bool1, bool2
		bool1 = true;
		bool2 = false;

		// create 2 String's s1, s2
		String s1, s2;

		/**
		 * static method is called using class name assign string value of primitives
		 * bool1, bool2 to s1, s2
		 */
		s1 = Boolean.toString(bool1);
		s2 = Boolean.toString(bool2);

		String str1 = "String value of boolean primitive " + bool1 + " is " + s1;
		String str2 = "String value of boolean primitive " + bool2 + " is " + s2;

		// print s1, s2 values
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void java_boolean_valueOf() {

		// create 2 Boolean objects b1, b2
		Boolean b1, b2;

		// create 2 String's and assign values
		String s1 = null;
		String s2 = "false";

		/**
		 * static method is called using class name assign result of valueOf method on
		 * s1, s2 to b1, b2
		 */
		b1 = Boolean.valueOf(s1);
		b2 = Boolean.valueOf(s2);

		String str1 = "Boolean instance of string " + s1 + " is " + b1;
		String str2 = "Boolean instance of string " + s2 + " is " + b2;

		// print b1, b2 values
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void javalang_Object_getClass() {

		// create a new ObjectDemo object
		GregorianCalendar cal = new GregorianCalendar();

		// print current time
		System.out.println("" + cal.getTime());

		// print the class of cal
		System.out.println("" + cal.getClass());

		// create a new Integer
		Integer i = new Integer(5);

		// print i
		System.out.println("" + i);

		// print the class of i
		System.out.println("" + i.getClass());

		AAscriptdevelopmentpackclass sd = new AAscriptdevelopmentpackclass();

		System.out.println("" + sd.getClass());

	}

	public static void getclass_getDeclaredMethod() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {

		Object objCustomerLoanHistory_Page = null;
		String col = null;

		AAscriptdevelopmentpackclass sd = new AAscriptdevelopmentpackclass();

		// TODO Auto-generated method stub
		String Actual = (String) sd.getClass().getDeclaredMethod("get_" + col.replace("Coltext.", ""), String.class)
				.invoke(objCustomerLoanHistory_Page, "asd");
		out.println(Actual);

	}

	public void process_destroy() {
		try {
			// create a new process
			System.out.println("Creating Process...");
			Process p = Runtime.getRuntime().exec("notepad.exe");

			// wait 10 seconds
			System.out.println("Waiting...");
			Thread.sleep(10000);

			// kill the process
			p.destroy();
			System.out.println("Process destroyed.");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
