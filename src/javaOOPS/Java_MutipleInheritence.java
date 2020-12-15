package javaOOPS;

interface X {
	public void myMethod();
}

interface Y {
	public void myMethod();
}

class Java_MutipleInheritence implements X, Y {
	public void myMethod() {
		System.out.println("MutipleInheritence can be achieved by implementing more than one interfaces");
	}

	public static void main(String args[]) {
		Java_MutipleInheritence obj = new Java_MutipleInheritence();
		obj.myMethod();
	}
}
