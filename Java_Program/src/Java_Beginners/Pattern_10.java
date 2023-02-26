package Java_Beginners;

/*    *
      **
      ***
      ****       */

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 displayPattern(4);
	}

	private static void displayPattern(int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<k;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
