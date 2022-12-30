package Java_Beginners;

public class EvenPositionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []arr=new int[]{1,2,3,4,5,6,7,8,9,0,10,11,};
		    System.out.println("Even Position");
		    for (int i=1;i<arr.length;i=i+2) {
		      System.out.println(arr[i]);
		    }
	}
}