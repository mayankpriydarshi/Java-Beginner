package Java_Beginners;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}
/*
*******
* *   *
*   * *
*******
*   * *
* *   *
*******
 */
	private static void pattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i==0||j==0||i==6||j==6||i==1&&j==2||i==2&&j==4||i==4&&j==4||i==5&&j==2||i==3 && j<=6) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
		}
		System.out.println();
		}
	}

}
