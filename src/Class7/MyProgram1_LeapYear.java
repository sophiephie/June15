package Class7;

import java.util.Scanner;

public class MyProgram1_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please put your year");
		int year = sc.nextInt();
		boolean result = is_leapYear(year);
		sc.close();

		if (result) {
			System.out.println("yes its leap");
		} else {
			System.out.println("nope");
		}
	}
		

	public static boolean is_leapYear(int y) {
		boolean a = (y % 4) ==0;
		boolean b = (y %100) != 0;
		boolean c = ((y %100 ==0) && (y%400==0));
		
		return a && (b||c);

	}

}
