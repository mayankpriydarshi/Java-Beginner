package Java_Beginners;

public class Pattern_J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				if(i==0||i<=4&&j==4||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==2&&j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}

}
