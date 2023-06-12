package Java_Beginners;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
five();
	}

	private static void five() {
		// TODO Auto-generated method stub
		Scanner f=new Scanner(System.in);
		int F=f.nextInt();
		while(F!=5) {
			F=f.nextInt();
		}
	}

}
