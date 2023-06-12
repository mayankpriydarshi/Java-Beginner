
package Java_Beginners;

import java.util.Scanner;

public class ReverseTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int m=s.nextInt();
 displayTable(m);
	}
	private static void displayTable(int m) {
		// TODO Auto-generated method stub
		for(int i=10;i>=1;i--){
			for(int j=m;j>=1;j--){	
				System.out.format("%d X %2d = %2d  ",j,i,i*j); 
	}
			
			System.out.println();
}
}
}