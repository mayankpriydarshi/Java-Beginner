package Java_Beginners;

import java.util.Scanner;

public class Pattern_6 {

/*
00 01 02 03 04 05 
01 02 03 04 05 06 
02 03 04 05 06 07 
03 04 05 06 07 08 
04 05 06 07 08 09 
05 06 07 08 09 10  */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		Scanner m=new Scanner(System.in);
		int n=m.nextInt();
			for(int i=0;i<n;i++) {
				int count=i;
				for(int j=0;j<n;j++){
					if(count<10) {
						System.out.print("0");
					}
					System.out.print(count++);
					System.out.print(" ");
					}
				System.out.println();
			}
		
	}

}
