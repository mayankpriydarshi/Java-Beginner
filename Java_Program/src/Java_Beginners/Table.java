 package Java_Beginners;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//displayTable(9);
//displayTableUpto(9);
		Scanner n=new Scanner(System.in);
		int m=n.nextInt();
		displayTableUptoRowWise(m);		
	}	
	private static void displayTableUptoRowWise(int m){
		// TODO Auto-generated method stub	
		for(int i=1; i<=10;i++){
			for(int j=1;j<=m;j++){	
				System.out.format("%d X %2d = %2d  ",j,i,i*j); 	
			//	System.out.print(j+ " x " + i + " = " + i*j + " ");		
			}
			System.out.println();
				}		
	}

}