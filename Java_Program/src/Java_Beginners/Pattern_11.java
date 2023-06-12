package Java_Beginners;

import java.util.Scanner;

public class Pattern_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
 displayPattern(n);
	}
/*
****
 ***
  **
   *
 */
	private static void displayPattern(int n) {
		// TODO Auto-generated method stub
		for (int i=n;i>=1;i--)
	    {
	      for (int j=n;j>i;j--)
	    {
	       System.out.print(" ");
	    }
	     for (int k=1;k<=i;k++)
	    {
	      System.out.print("*");
	    }
	     System.out.println();
	    }
	}

}
