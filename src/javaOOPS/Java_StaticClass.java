package javaOOPS;

public class Java_StaticClass {

	static int num;
	static String mystr;

	static {
		// static block
		System.out.println("static initialization block - run only once when a class is loaded into memory");
		System.out.println("an option for initializing or setting up the class at run-time");
		System.out.println("The keyword 'static' indicates that it spans all instances of the classe");
		System.out.println("It is like a mini-global set of instructions.");
		num = 1;
		mystr = "static Block";

		System.out.println("--------------------------------------------------------------------");

	}

	static void static_method() {
		num = 2;
		mystr = "static_method";

		System.out.println("static_method can be used without creating an object");

		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);

	}

	void nonstatic_method() {
		num = 3;
		mystr = "nonstatic_method";

		System.out.println("calling static_method inside nonstatic_method without creatiing an object");
		static_method();

		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);

	}

	public static void main(String args[]) {

		System.out.println("calling static method without creating an object");
		static_method();

		Java_StaticClass obj = new Java_StaticClass();

		System.out.println("calling nonstatic_method method after creating an object");
		obj.nonstatic_method();

	}

}
