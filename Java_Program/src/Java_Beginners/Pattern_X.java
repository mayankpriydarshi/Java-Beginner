package Java_Beginners;

public class Pattern_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
pattern_X(n);
	}
/*
*   *
 * * 
  *  
 * * 
*   *
 */
	private static void pattern_X(int n) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
		  for(int j=0;j<5;j++) {
			  if(i==0&&j==0||i==0&&j==4||i==1&&j==1||i==1&&j==3||i==2&&j==2
				  ||i==3&&j==1||i==3&&j==3||i==4&&j==0||i==4&&j==4)
			System.out.print("X"); 
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
		}
	}

}
