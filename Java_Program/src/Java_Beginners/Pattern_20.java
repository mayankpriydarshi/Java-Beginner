package Java_Beginners;

import java.util.Scanner;

/*  ****
    ***
    **
    *           */

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
displayPattern();
	}
	private static void displayPattern() {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
