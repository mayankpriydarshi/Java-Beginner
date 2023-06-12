package Java_Beginners;

import java.util.Scanner;

public class Pattern_A_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		int p=t.nextInt();
		for(int m=0;m<p;m++){
			for(int n=0;n<p;n++) {
			if(m==0&&n<p/2&&n!=0||n==0&&m!=0
					||n==p/2&&m!=0||m==p/2&&n<=p/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		t.close();
	}
}
