package Activity5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		printMatrix(num);
		sc.close();
	}

	public static void printMatrix(int num) {

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print((int) (Math.random() * 2) + "  ");
			}
			System.out.println();
		}

	}

}
