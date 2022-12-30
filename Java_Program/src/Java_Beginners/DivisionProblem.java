package Java_Beginners;

public class DivisionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
	     isDivisbleBy(9);
	     isDivisbleBy(10);
	     isDivisbleBy(11);
	     isDivisbleBy(12);
		a++;
		

	}
	
	

	 static void isDivisbleBy(int a) {
		
		 boolean status = a%3 ==0 ;
		System.out.println("is "+ a + " is divisble by 3->"+status);
	}

}
