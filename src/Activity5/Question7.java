package Activity5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of sides: ");
        int n = sc.nextInt();
        System.out.print("Input the side: ");
        double side = sc.nextDouble();
        sc.close();

        System.out.println("The area of the pentagon is " + pentagon_area(n, side));
    }

    public static double pentagon_area(int n, double s) {
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));

	}

}
