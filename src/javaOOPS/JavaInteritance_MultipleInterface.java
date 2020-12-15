	package javaOOPS;

interface InterfaceA {
	void interfaceMethodA();
}

interface InterfaceB {
	void interfaceMethodB();
}

class ImplementingClassA implements InterfaceA, InterfaceB {
	public void interfaceMethodA() {
		System.out.println("mAA");
	}

	public void interfaceMethodB() {
		System.out.println("mAB");
	}
}

class ImplementingClassB implements InterfaceA, InterfaceB {
	public void interfaceMethodA() {
		System.out.println("mBA");
	}

	public void interfaceMethodB() {
		System.out.println("mBB");
	}

}

public class JavaInteritance_MultipleInterface {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Implenenting Interface methods via classes");

		ImplementingClassA u = new ImplementingClassA();
		ImplementingClassB v = new ImplementingClassB();
		
		u.interfaceMethodA();
		// prints "interfaceA, interfaceMethodA, implementation A"
		u.interfaceMethodB();
		// prints "interfaceB, interfaceMethodB, implementation A"
		v.interfaceMethodA();
		// prints "interfaceA, interfaceMethodA, implementation B"
		v.interfaceMethodB();
		// prints "interfaceB, interfaceMethodB, implementation B"
		
		System.out.println("-----------------------------------------------------");
		System.out.println("Implenenting Interface methods via Interface");


		InterfaceA w = new ImplementingClassA();
		w.interfaceMethodA();
		// prints "interfaceA, interfaceMethodA, implementation A"

		InterfaceA x = new ImplementingClassB();
		x.interfaceMethodA();
		// prints "interfaceA, interfaceMethodA, implementation B"
		
		InterfaceB y = new ImplementingClassA();				
		y.interfaceMethodB();
		// prints "interfaceB, interfaceMethodB, implementation A"

		InterfaceB z = new ImplementingClassB();
		z.interfaceMethodB();
		// prints "interfaceB, interfaceMethodB, implementation B"
	}
}