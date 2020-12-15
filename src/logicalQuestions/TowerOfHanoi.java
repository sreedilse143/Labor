package logicalQuestions;

public class TowerOfHanoi {

	public static void main(String[] args) {
		doTowers(3, 'A', 'B', 'C');
		move(5, 1, 3);

	}

	public static void doTowers(int topN, char from, char inter, char to) {
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);
		}
	}

	public static void move(int n, int startPole, int endPole) {
		if (n == 0) {
			return;
		}
		int intermediatePole = 6 - startPole - endPole;
		move(n - 1, startPole, intermediatePole);
		System.out.println("Move " + n + " from " + startPole + " to " + endPole);
		move(n - 1, intermediatePole, endPole);
	}

}
