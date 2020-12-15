package logicalQuestions;

public class Fibonacci {

	public static void main(String[] args) {
		for (int counter = 4; counter <= 10; counter++) {
			System.out.printf("Fibonacci of %d is: %d\n", counter, dofibonacci(counter));
		}
	}

	public static long dofibonacci(long number) {
		if ((number == 0) || (number == 1))
			return number;
		else
			return dofibonacci(number - 1) + dofibonacci(number - 2);
	}

}
