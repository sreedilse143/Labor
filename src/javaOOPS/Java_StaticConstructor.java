package javaOOPS;

public class Java_StaticConstructor {
	static int num;
	static String mystr;

	static {

		// static block
		num = 1;
		mystr = "Static block";
	}
	static {

		// static block
		num = 2;
		mystr = "multiple Static block";
	}

	public Java_StaticConstructor() {
		num = 3;
		mystr = "StaticConstructor is created";
	}

	public Java_StaticConstructor(int mynum) {
		num = 4;
		mystr = "StaticConstructor is overloaded";
	}

	public static void main(String[] args) {
		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);

		Java_StaticConstructor o = new Java_StaticConstructor();
		System.out.println("Value of num: " + o.num);
		System.out.println("Value of mystr: " + o.mystr);

	}

}
