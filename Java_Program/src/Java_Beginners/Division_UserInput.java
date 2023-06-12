package Java_Beginners;

import java.util.Scanner;

public class Division_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method
     div();
	}

	private static void div() {
		// TODO Auto-generated method stub
		Scanner D=new Scanner(System.in);
		System.out.println("Enter Dividend");
		int n=D.nextInt();
		System.out.println("Enter Divisor");
		int n1=D.nextInt();
		D.close();
		int r= n%n1;
		int div=n/n1;
		System.out.println("Quotient of "+n+"&"+n1+"="+div);
		System.out.println("Reminder of "+n+"&"+n1+"="+r);
	}

}
