package Activity5;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			System.out.printf("%-7d", penNumFormula(i));
			if (i % 10 == 0)
				System.out.println();
		}
	}

	// Pentagonal Number Formula
	public static int penNumFormula(int i) {
		int number = (i * (3 * i - 1)) / 2;
		return number;
	}

}
