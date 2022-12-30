package Java_Beginners;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= new int [] {5,6,7,8,9,};  
	        System.out.println("Array");  
	        for (int i=0;i<arr.length;i++) {  
	        System.out.print(arr[i]+" ");  
	        }  
	        System.out.println();  
	        System.out.println("Reverse Array");   
	        for (int i=arr.length-1;i>=0;i--){  
	         System.out.print(arr[i]+" ");  
	        }  
	}
}