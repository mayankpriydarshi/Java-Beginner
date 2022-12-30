package Java_Beginners;

public class SumElementArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr= {5,1,2,4,9};
		      int s= 0;
		      for( int n:arr) {
		          s = s+n;
		      }
		      System.out.println("Sum Of Elements= "+s);
	}
}