package Java_Beginners;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int [] n = new int [] {2,4,6,4,7,7,9,3};
		    System.out.println("Duplicate Elements");
		    for(int i = 0; i < n.length; i++) 
		    {
		      for(int j = i + 1; j < n.length; j++) 
		      {
		        if(n[i] == n[j]) 
		        {
		          System.out.println(n[j]);
		        }
		      }
		    }
	}
}
