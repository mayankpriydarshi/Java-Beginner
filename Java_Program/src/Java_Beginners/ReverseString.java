package Java_Beginners;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner m=new Scanner(System.in);
String s=m.nextLine();
// TODO Auto-generated method stub
reverseString(s);
	}

	private static void reverseString(String s) {
		// TODO Auto-generated method stub
		
		  String reverse = "";
	        for (int i = s.length()-1;i>=0;i--) {
	            reverse = reverse + s.charAt(i);
	        }
	        System.out.println(reverse);
	}
}
