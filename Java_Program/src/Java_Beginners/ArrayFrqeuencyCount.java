package Java_Beginners;

public class ArrayFrqeuencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] n = new int [] {2,2,6,4,5,8,5,2,4};
  int [] f = new int [n.length];
  int c = -1;
		    for(int i = 0; i < n.length; i++){
		      int count = 1;
		      for(int j = i+1; j < n.length; j++){
		        if(n[i] == n[j]){
		          count++;
		          f[j] = c;
		        }
		      }
		      if(f[i] != c)
		        f[i] = count;
		    }
		    for(int i = 0; i < f.length; i++){
		      if(f[i] != c)
		        System.out.println("Element: "+n[i] + " Frequency: " + f[i]);
		    }
		  }
	}


