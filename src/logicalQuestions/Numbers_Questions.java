package logicalQuestions;

import java.util.TreeMap;

public class Numbers_Questions {

	private final static TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers_Questions o = new Numbers_Questions();
		o.primenumber_for();
	}

	public void swap2Numbers_with3Variables() {

	}

	public void swap2Numbers_with2Variables() {

	}

	public void highest_Number1() {

	}

	public void secondhighest_Number() {

	}

	public void lowest_Number() {

	}

	public void secondlowest_Number() {

	}

	public void sumofalldigits_Number() {

	}

	public void sumof_NaturalNumber(int num) {
		System.out.println("sumof_NaturalNumber = 1 + 2 + 3 + ... +" + num);
		int sum = 0;
		for (int i = 1; i <= num; ++i) {
			// sum = sum + i;
			sum += i;
		}
		System.out.println("Sum = " + sum);

	}

	public void multiplyofalldigits_Number() {

	}

	public void factorial_Number(int num) {
		System.out.println("factorial of " + num + "(" + num + "!) = 1 * 2 * 3 * 4 * ... * " + num);
		long factorial = 1;
		for (int i = 1; i <= num; ++i) {
			// factorial = factorial * i;
			factorial *= i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);

	}

	public void CheckNumber_ifPositiveNegative(double number) {
		if (number < 0.0)
			System.out.println(number + " is a negative number.");
		// true if number is greater than 0
		else if (number > 0.0)
			System.out.println(number + " is a positive number.");
		// if both test expression is evaluated to false
		else
			System.out.println(number + " is 0.");

	}

	public void Verify_LeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");

	}

	public void print_1to100_withoutloop(int num) {
		if (num <= 100) {
			System.out.print(num + " ");
			print_1to100_withoutloop(num + 1);
		}
	}

	public void multiplicationTable_Number(int num) {
		for (int i = 1; i <= 10; ++i) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
	}

	public void Fibonacci_forloop(int num) {
		System.out.println("The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...");

		int t1 = 0, t2 = 1;
		System.out.print("Fibonacci sequence of " + num + " terms: ");
		for (int i = 1; i <= num; ++i) {
			System.out.print(t1 + ", ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

	}

	public void reverse_number(long num) {
		System.out.println("number is: " + num);
		System.out.println("number/10 is: " + num / 10);
		System.out.println("number%10 is: " + num % 10);

		long reversenum = 0;
		while (num != 0) {
			reversenum = (reversenum * 10) + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse of input number is: " + reversenum);

	}

	public void check_Even_Odd(int num) {
		if (num % 2 == 0)
			System.out.println(num + " = is even number ");
		else
			System.out.println(num + " = is odd number ");

	}

	public void find_squareroot(int num) {
		double temp;

		double sr = num / 2;

		do {
			temp = sr;
			sr = (temp + (num / temp)) / 2;
		} while ((temp - sr) != 0);

		System.out.println(sr + " = squarerootr ");
	}

	public void find_square_Cube_Number(int num) {
		double sqrt_num = Math.sqrt(num);
		double fsq = Math.floor(sqrt_num);
		double sq_num = Math.pow(num, 2);
		double cub_num = Math.pow(num, 3);

		/*
		 * Math.floor() returns closest integer value, for example Math.floor of 984.1
		 * is 984, so if the value of sq is non integer than the below expression would
		 * be non-zero.
		 */
		System.out.println(fsq + " = find_squareRoot floor ");
		System.out.println(sq_num + " = find_squareNumber ");
		System.out.println(cub_num + " = find_CubeNumber");

	}

	public void area_OfCricle(double radius) {
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * 2 * radius;
		System.out.println("The area of circle is: " + area);
		System.out.println("The circumference of the circle is:" + circumference);
	}

	public void area_OfSquare(double side) {
		double area = side * side;
		System.out.println("Area of Square is: " + area);

	}

	public void area_OfRectangle(double length, double width) {
		double area = length * width;
		System.out.println("Area of Rectangle is:" + area);
	}

	public void area_OfTriangle(double base, double height) {
		// Area = (width*height)/2
		double area = (base * height) / 2;
		System.out.println("Area of Triangle is: " + area);
	}

	public void testRomanConversion(int myNum) {

		tm.put(1000, "M");
		tm.put(900, "CM");
		tm.put(500, "D");
		tm.put(400, "CD");
		tm.put(100, "C");
		tm.put(90, "XC");
		tm.put(50, "L");
		tm.put(40, "XL");
		tm.put(10, "X");
		tm.put(9, "IX");
		tm.put(5, "V");
		tm.put(4, "IV");
		tm.put(1, "I");

		System.out.println(tm.floorKey(myNum));

	}

	private void primenumber_for() {
		boolean bprimeflag = true;
		for (int num = 2; num <= 100; num++) {
			bprimeflag = true;
			for (int div = 2; div <= Math.sqrt(num); div++) {
				if (num % div == 0) {
					bprimeflag = false;
					break;
				}
			}
			if (bprimeflag) {
				System.out.println("primenumber is: " + num);
			}
		}
	}

}
