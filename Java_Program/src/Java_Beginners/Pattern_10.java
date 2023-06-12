package Java_Beginners;

import java.util.Scanner;

/*    *
      **
      ***
      ****       */

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
 displayPattern(k);
	}

	private static void displayPattern(int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<k;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
