package Activity5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int num = sc.nextInt();
		
		System.out.println(checkPrimeNum(num));

	}

	public static boolean checkPrimeNum(int number) {
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}

}
