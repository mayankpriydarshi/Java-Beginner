package Java_Beginners;

public class Pattern3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 displayPattern(4);
	}

	private static void displayPattern(int n) {
		// TODO Auto-generated method stub
		int row = 1;
		int star = n;
		int space = 0;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			// next row
			System.out.println();
			row++;
			space++;
			star--;

		}
	}

}
