package Java_Beginners;

import java.util.Scanner;

public class Multiplication_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
multiplaction();
	}
	private static void multiplaction() {
		// TODO Auto-generated method stub
		Scanner MN =new Scanner(System.in);
		System.out.println("Enter First Number ");
		int num1 = MN.nextInt();
		System.out.println("Enter Second Number ");
		int num2= MN.nextInt();
		MN.close();
		int r= num1*num2;
		System.out.println("Multiplaction of First and Second Number is "+r);
	}
}