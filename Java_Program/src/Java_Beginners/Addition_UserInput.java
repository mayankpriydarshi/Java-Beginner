package Java_Beginners;

import java.util.Scanner;

public class Addition_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
	}

	private static void add() {
		// TODO Auto-generated method stub
		Scanner A=new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1=A.nextInt();
		System.out.println("Enter Second Number");
		int n2=A.nextInt();
		A.close();
		int R=n1+n2;
		System.out.println("Addition of"+n1+"+"+n2+"="+R);
	}

}
