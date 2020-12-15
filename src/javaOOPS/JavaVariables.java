package javaOOPS;

public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVariables.java_localvariable();
		JavaVariables.java_Instancevariable();
		JavaVariables.java_Staticvariable();

	}

	public static void java_localvariable() {
		int age = 10;
		age = age + 5;
		System.out.println("Student age is : " + age);
	}

	public static void java_Instancevariable() {
		InstanceVariables iv = new InstanceVariables();
		iv.engMarks = 40;
		System.out.println(iv.engMarks);
	}

	public static void java_Staticvariable() {
		InstanceVariables.StudentName = "Jeffa";
		System.out.println(InstanceVariables.StudentName);

	}
}

class InstanceVariables {
	// These variables are instance variables.
	// These variables are in a class and are not inside any function
	int engMarks;
	static String StudentName;

}
