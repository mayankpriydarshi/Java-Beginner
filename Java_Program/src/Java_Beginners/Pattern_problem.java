package Java_Beginners;

public class Pattern_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pattern();
	}

	private static void pattern() {
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=8;j++) {
				if(i==0&&j<8) {
					System.out.print("5");
				}
						if(i==1&&j==1||i==1&&j==2||i==1&&j==3) {
							System.out.print("4");
						}
			else {
				System.out.print("#");
			}
	}
	System.out.println();
			}
		}
	}


