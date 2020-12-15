package javaOOPS;

//four types of Access levels – public, protected, private & default 

class JavaNestedClass {
	private static String staticString = "This is a private staticString";
	String nonstaticString = "This is a default nonstaticString";

	// Static class
	static class StaticClass {

		public void nonstatic_method() {

			/*
			 * If you make the variable of outer class non-static then you will get
			 * compilation error because: a nested static class cannot access non- static
			 * members of the outer class.
			 */
			System.out.println(staticString);
		}

	}

	public static void main(String args[]) {
		/*
		 * To create instance of nested class we didn't need the outer class instance
		 * but for a regular nested class you would need to create an instance of outer
		 * class first
		 */
		JavaNestedClass.StaticClass obj = new JavaNestedClass.StaticClass();
		obj.nonstatic_method();

		StaticClass scobj = new StaticClass();
		scobj.nonstatic_method();
	}
}
