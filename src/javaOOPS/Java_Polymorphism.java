/*
 * compile-time polymorphism and runtime polymorphism
 * polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism.
 */

package javaOOPS;

public class Java_Polymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Java_Polymorphism a = new Java_Polymorphism();

		a.RuntimePolymorphism_OverRiding();
		a.MethodOverloading_NoOfArguments();
		a.MethodOverloading_Adder_ChangeOfDataType();

	}

	void RuntimePolymorphism_OverRiding() {
		Bike bo;

		bo = new Splendor();// upcasting
		bo.applybreak();
		bo = new AnimatedBike();// upcasting
		bo.applybreak();
	}

	void MethodOverloading_NoOfArguments() {
		System.out.println(Adder_NoOfArguments.add(11, 11));
		System.out.println(Adder_NoOfArguments.add(11, 11, 11));

	}

	void MethodOverloading_Adder_ChangeOfDataType() {
		System.out.println(Adder_ChangeOfDataType.add(1, 2));
		System.out.println(Adder_ChangeOfDataType.add(11.23, 11.11));

	}

}

class Bike {
	void start() {
		System.out.println("Bike started with key");
	}

	void seeingmirror() {
		System.out.println("seeingmirror");
	}

	void applybreak() {
		System.out.println("applybreak");
	}

}

class Splendor extends Bike {
	void ccpower() {
		System.out.println("Splendor bike is 100cc");
	}
}

class AnimatedBike extends Bike {
	void start() {
		System.out.println("start with whistling");
	}

	void seeingmirror() {
		System.out.println("digitalscreen");
	}

	void applybreak() {
		System.out.println("applybreakbyshouting");
	}

}

class Adder_NoOfArguments {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class Adder_ChangeOfDataType {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}
