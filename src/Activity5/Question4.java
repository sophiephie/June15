package Activity5;

import java.util.Scanner;

public class Question4 {

	public static final int PASSWORD_LENGTH = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a password at least ten characters.");

		String pass = sc.next();
		sc.close();

		boolean result = validPass(pass);

		if (result) {
			System.out.println("Yes you got it");
		} else {
			System.out.println("Nope");
		}
	}

	public static boolean validPass(String password) {
		if (password.length() < PASSWORD_LENGTH) {
			return false;
		}
		int charCount = 0, numCount = 0;

		for (int i = 0; i < password.length(); i++) { 
			char mych = password.charAt(i);

			if (checkNum(mych)) {
				numCount++;
			} else if (checkLetter(mych)) {
				charCount++;
			} else {
				return false;
			}
		}

		return (charCount >= 2 && numCount >= 2);
	}

	public static boolean checkLetter(char ch) {
		ch = Character.toUpperCase(ch);
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkNum(char ch) {
		if (ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}
}