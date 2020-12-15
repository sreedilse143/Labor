package logicalQuestions;

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes o = new Shapes();
		o.floydTriangle_LeftAngle_Stars(5);
	}

	public void pyramid() {

	}

	public void LA_Triangle() {

	}

	public void RA_Triangle() {

	}

	public void Triangle() {

	}

	public void Diamond() {

	}

	public void Circle() {

	}

	public void unknown_shape1() {
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  *  ");
		System.out.println("**   ");
	}

	public void lat_alphaanumeric_shape1() {
		System.out.println("1");
		System.out.println("a a");
		System.out.println("2 2");
		System.out.println("b b b");
		System.out.println("3 3 3");
		System.out.println("c c c c");
	}

	public void floydTriangle_LeftAngle_Numbers(int rows) {
		int num = 1;
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for (int r = 1; r <= rows; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(num + " ");
				// Incrementing the number value
				num++;
			}
			// For new line
			System.out.println();
		}

	}

	public void floydTriangle_LeftAngle_Stars(int printrows) {
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for (int r = 1; r <= printrows; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	public void rat_shape1() {

	}

}
