package Java_Beginners;

public class Pattern_H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==0||i==2||j==4) {
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