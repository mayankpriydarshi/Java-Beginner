package Java_Beginners;

public class Pattern_E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}
	private static void pattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i<=4&&j==0 ||i==0&&j<=4||i==2&&j<=4||i==4&&j<=4) {
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
