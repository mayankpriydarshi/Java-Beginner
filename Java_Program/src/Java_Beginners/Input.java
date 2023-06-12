package Java_Beginners;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
input();
	}

	private static void input() {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		String N=n.nextLine();
	//	System.out.println(N);
		//Scanner a=new Scanner(System.in);
		int A=n.nextInt();
		n.next();
		String F=n.nextLine();
		
		System.out.print("Name "+N+" Age "+A+" Sub "+F);
		
	}

}
