package Java_Beginners;

public class Pattern_G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||j==0||i==4&&j==1||i==4&&j==2||i==4&&j==4||i==3&&j==2
						||i==3&&j==4||i==2&&j==2||i==2&&j==3||i==2&&j==4) {
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
