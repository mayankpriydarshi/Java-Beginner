
package Java_Beginners;

import java.util.Scanner;

public class PrintPractice{
	public static void main(String[]kkkk) {
		Scanner m=new Scanner(System.in);
		int fact=m.nextInt();
		
		System.out.print(factn(fact));
		
	}
	static int factn(int n) {
		
		if(n==1)
			return 1;
					int facto=n*factn(n-1);
					return facto;
	}
}