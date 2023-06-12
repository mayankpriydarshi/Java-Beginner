package Java_Beginners;

import java.util.Scanner;

public class Pattern_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 pattern();
	}
	private static void pattern() {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
		for(int k=0;k<n;k++) {
			for(int p=0;p<n;p++) {
			  if(p==0||k==0&&p<n/2
				  ||k==n/2&&p<n/2||k==n-1&&p<n/2
					||p==n/2&&k!=0&&k!=n/2&&k!=n-1){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		}
		System.out.println();
	}
}
}