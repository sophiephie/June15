package Activity5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double s1, s2, s3;

		System.out.println("Enter the 3 sides: ");
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		
		System.out.println("The area of the triangle is " + area);

		sc.close();

//		if ((s1 + s2) > s3 && (s1 + s3) > s2 && (s2 + s3) > s1) {
//			double s = (s1 + s2 + s3) / 2;
//
//			// Using heron's formula to find the area
//			double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
//
//			System.out.println("Area of Triangle is: " + area);
//		} else {
//			System.out.println("The triangle with entered dimensions does not exist");
//		}

	}

}
