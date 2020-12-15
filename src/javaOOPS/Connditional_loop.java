package javaOOPS;

public class Connditional_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connditional_loop.java_break();
		Connditional_loop.java_continue();
		Connditional_loop.label_Continue_Break();
		Connditional_loop.test_enum_Switch();
		Connditional_loop.java_For();
		Connditional_loop.var_args();
		
	}

	public static void java_break() {
		int[] intary = { 99, 12, 22, 34, 45, 67, 5678, 8990 };
		int no = 5678;
		int i = 0;
		boolean found = false;

		for (; i < intary.length; i++) {
			if (intary[i] == no) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Found the no: " + no + " at  index: " + i);
		} else {
			System.out.println(no + "not found  in the array");
		}
	}

	public static void java_continue() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}

	public static void label_Continue_Break() {
		String strSearch = "This is the string in which you have to search for a substring.";
		String substring = "substring";
		boolean found = false;
		int max = strSearch.length() - substring.length();
		testlbl: for (int i = 0; i <= max; i++) {
			int length = substring.length();
			int j = i;
			int k = 0;
			while (length-- != 0) {
				if (strSearch.charAt(j++) != substring.charAt(k++)) {
					continue testlbl;
				}
			}
			found = true;
			break testlbl;
		}
		if (found) {
			System.out.println("Found the substring .");
		} else {
			System.out.println("did not find the substing in the string.");
		}
	}

	enum Choice {
		Choice1, Choice2, Choice3
	}

	public static void test_enum_Switch() {
		Choice ch = Choice.Choice1;

		switch (ch) {
		case Choice1:
			System.out.println("Choice1 selected");
			break;
		case Choice2:
			System.out.println("Choice2 selected");
			break;
		case Choice3:
			System.out.println("Choice3 selected");
			break;
		}
	}

	public static void java_For() {
		int[] intary = { 1, 2, 3, 4 };
		forDisplay(intary);
		foreachDisplay_VariableLength(new int[] { 1, 2, 3, 4, 5 });
		foreachDisplay_VariableLength(new String[] { "Wish", "You", "Aa", "Very", "Happy" });
	}

	public static void forDisplay(int[] myarr) {
		System.out.println("Display an array using for loop");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + " ");
		}
		System.out.println();
	}

	public static void foreachDisplay_VariableLength(int[] myarr) {
		System.out.println("Display an array using for each loop");
		for (int i : myarr) {
			System.out.print(i + " ");
		}
	}

	public static void foreachDisplay_VariableLength(String[] myarr) {
		System.out.println("Display an array using for each loop");
		for (String i : myarr) {
			System.out.print(i + " ");
		}
	}

	public static void var_args() {
		display();
		display("Tutorialspoint");
		display("Wish", "You", "Aa", "Very", "Happy");
	}

	static void display(String... values) {
		System.out.println("display method invoked ");
		for (String s : values) {
			System.out.println(s);
		}
	}

}
