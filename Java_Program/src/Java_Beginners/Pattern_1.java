package Java_Beginners;

import java.util.Scanner;

public class Pattern_1 {
	public static void main(String[] args) {
/*
# # # # #  
# # # # #  
# # # # #  
# # # # #  
# # # # #  
*/
		pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
				Byte k=s.nextByte();
		for(int m=1;m<=k;m++)
		{
		for(int n=1;n<=k;n++)
		{
		System.out.print("# ");
	}
		System.out.println(" ");
}
}
}