package Java_Beginners;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner n=new Scanner(System.in);
int m=n.nextInt();
pattern(m);
}
	private static void pattern(int m) {
		// TODO Auto-generated method stub
		for(int p=0;p<m;p++) {
			for(int t=0;t<m;t++) {
				if(p==0||t==0||p==m-1||t==m-1||p==m/2||t==m/2){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
