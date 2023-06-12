package Java_Beginners;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit=25;
		fahr(fahrenheit);
	}
	private static void fahr(double fahrenheit) {
		// TODO Auto-generated method stub
		 double celsius=(fahrenheit-32)*5/9;
		 // double fahrenheit=(celsius+32)*9/5;//for Celsius to fahrenhite
		System.out.println(celsius);
	}
}
