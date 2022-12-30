package Java_Beginners;

public class SmallestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {1,0,4,8,9,6,7,3,2};    
	        int min = arr[0];    
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest Element= " + min);  
	}
}
