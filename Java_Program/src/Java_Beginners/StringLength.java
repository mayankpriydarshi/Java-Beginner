package Java_Beginners;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
strLen();
	}

	private static void strLen() {
		// TODO Auto-generated method stub
		String firstName="Mayank";
		String lastName="priydarshi";
		String fullName=firstName+" "+lastName;
		System.out.println("Hello, My name is "+fullName);
		int nameLength=firstName.length()+lastName.length();
		System.out.println("There are "+nameLength+" letters in my name.");
	}

}
