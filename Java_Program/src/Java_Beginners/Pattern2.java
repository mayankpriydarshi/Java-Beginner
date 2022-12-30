package Java_Beginners;

/*  ****
    ***
    **
    *           */

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
displayPattern(4);
	}
	private static void displayPattern(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
