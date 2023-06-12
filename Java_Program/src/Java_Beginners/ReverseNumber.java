package Java_Beginners;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
revnum();
	}
	private static void revnum() {
		// TODO Auto-generated method stub
		int n=1234,
		rev=0;
		int re = n % 10;  
		n = n/10;  
		rev = rev * 10 + re;  
		System.out.println("Reverse=" + rev);
	}

}
