package Activity5;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 3 numbers ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		System.out.println(calculateMidpointNumber(num1, num2, num3));

	}

	public static boolean calculateMidpointNumber(int num1, int num2, int num3) {
		boolean isMidpoint;

		if (num1 < num2 && num2 < num3) {
			isMidpoint = true;
		} else {
			isMidpoint = false;
		}

		return isMidpoint;
	}

}
