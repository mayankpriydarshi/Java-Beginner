package Java_Beginners;

public class CopyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] f = new int [] {1,2,3,4,5};
		   int s[] = new int[f.length];
           System.out.println("Elements of First array: ");
		    for (int i = 0; i < f.length; i++) {
		      System.out.print(f[i] + " ");
		    }
		    for (int i = 0; i < f.length; i++) {
		      s[i] = f[i];
		    }
		    System.out.println();
		    System.out.println("Elements of Copied array: ");
		   for (int i = 0; i < s.length; i++) {
			     System.out.print(s[i] + " ");
		    }
		  }
	}

