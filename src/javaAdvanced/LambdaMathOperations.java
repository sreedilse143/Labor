package javaAdvanced;
import static java.lang.System.out;

public class LambdaMathOperations {
	final static String salutation = "Hello! ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void javaLambda() {

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		
		
		out.println("10 + 5 = " + operate(10, 5, addition));
		out.println("10 - 5 = " + operate(10, 5, subtraction));
		out.println("10 x 5 = " + operate(10, 5, multiplication));
		out.println("10 / 5 = " + operate(10, 5, division));

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	private static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}


}
