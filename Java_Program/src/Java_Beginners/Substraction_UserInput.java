package Java_Beginners;

import java.util.Scanner;

public class Substraction_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sub();

	}

	private static void sub() {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=S.nextInt();
		System.out.println("Enter Second Number");
		int n2=S.nextInt();
		S.close();
		int R=n1-n2;
		System.out.println("Substraction of"+n1+"-"+n2+"="+R);
	}

}
