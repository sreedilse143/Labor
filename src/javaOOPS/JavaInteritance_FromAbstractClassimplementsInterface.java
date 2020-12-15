package javaOOPS;

interface Interface {
	void abstractMethod();
}

abstract class AbstractClass implements Interface {
	abstract public void abstractMethod();
}

class InheritsFromInterface implements Interface {
	public void abstractMethod() {
		System.out.println("implemented abstractMethod() InheritsFromInterface");
	}
}

class InteritsFromAbstractClass extends AbstractClass {
	public void abstractMethod() {
		System.out.println("implemented abstractMethod() InteritsFromAbstractClass");
	}
}

class InteritsFromAbstractClassimplementsInterface extends AbstractClass implements Interface {
	public void abstractMethod() {
		System.out.println("implemented abstractMethod() InteritsFromAbstractClassimplementsInterface");
	}
}


public class JavaInteritance_FromAbstractClassimplementsInterface {

	public static void main(String[] args) {
		InheritsFromInterface i = new InheritsFromInterface();
		i.abstractMethod();
		InteritsFromAbstractClass ac = new InteritsFromAbstractClass();
		ac.abstractMethod();
		InteritsFromAbstractClassimplementsInterface ac_i = new InteritsFromAbstractClassimplementsInterface();
		ac_i.abstractMethod();
	}
}
