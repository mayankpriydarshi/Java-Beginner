package Java_Beginners;

import java.util.Random;
import java.util.Scanner;

public class WinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
game();
	}

	private static void game() {
		// TODO Auto-generated method stub
		Random m =new Random();
		int n=m.nextInt(100);
		boolean b=false;
		int count=0;
		int k=0;
		while(!b) {	
			Scanner sc=new Scanner(System.in);
		int g = sc.nextInt();
		count++;
		if(g==n) {
			b=true;
			System.out.println("win");
		}else if(g<n) {
			k++;
			System.out.println("grater");
		}else if(g>n) {
			k++;
			System.out.println("smaller");
		}
		}
		System.out.println("times"+count);
	}

}
