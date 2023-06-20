package Activity5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input year");
		int year = sc.nextInt();
		boolean result = calculateLeapYear(year);
		sc.close();

		if (result) {
			System.out.println("yes its leap year");
		} else {
			System.out.println("false");
		}

	}

	public static boolean calculateLeapYear(int year) {
		boolean a = (year % 4) == 0;
		boolean b = (year % 100) != 0;
		boolean c = ((year % 100 == 0) && (year % 400 == 0));

		return a && (b || c);
	}

}
