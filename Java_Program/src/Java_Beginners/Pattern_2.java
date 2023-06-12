package Java_Beginners;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  pattern();
/*
######
#    #
#    #
#    #
#    #
######
*/
	}
	private static void pattern() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		for(int m=1;m<=k;m++)
		{
			for(int n=1;n<=k;n++)
			{
				if(m==1||n==1||m==k||n==k) 
				{
				System.out.print("#");
				}
				else {
			System.out.print(" ");
		}
	}
		System.out.println();
}
}
}