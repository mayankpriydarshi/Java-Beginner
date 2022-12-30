package Java_Beginners;

public class OddPositionArray {

	public static void main(String[] args){
		// TODO Auto-generated method stub
	int []arr=new int[]{1,2,3,4,5,6,7,8};
       System.out.println("Odd Positions: ");
		 for(int i=0;i<arr.length;i=i+2){
		      System.out.println(arr[i]);
	}
}
}
