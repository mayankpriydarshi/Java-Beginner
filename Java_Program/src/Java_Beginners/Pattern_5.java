package Java_Beginners;

public class Pattern_5 {
/* 
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25 

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=1;
pattern(n,count);
	}
	private static void pattern(int n, int count) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count++);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
