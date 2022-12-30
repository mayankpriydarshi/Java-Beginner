package Java_Beginners;

public class LargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = new int [] {2,4,6,8,9,8,};  
	        int max = arr[0];
	        for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest Element= " + max); 
	}

}
