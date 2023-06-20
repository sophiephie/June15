package Activity5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your investment amount, the interest rate and the number of investment year.");
		double amount = sc.nextDouble(); // investment amount
		double rateperc = sc.nextDouble(); // interest rate percentage
		int year = sc.nextInt(); // number of investment years	}
		
		sc.close();
		for (int i = 1; i <= year; i++) {
			System.out.printf("Year %d : %.2f %n", i, calculateInvestment(i, amount, rateperc));
		}
	}
	public static double calculateInvestment(int years, double initialAmount, double rateperc) {
		double investmentAmount = 0;

		double monthRate = ((rateperc/12) / 100) + 1;
		double pow = Math.pow(monthRate, 12 * years);

		investmentAmount = initialAmount * pow;

		return investmentAmount;
	}

}
