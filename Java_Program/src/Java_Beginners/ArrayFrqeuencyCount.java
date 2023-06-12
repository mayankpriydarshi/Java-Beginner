package Java_Beginners;

import java.util.Scanner;

public class ArrayFrqeuencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
 int [] n = new int [r];
  int [] f = new int [r];
  int c = 0;
		    for(int i = 0; i < r; i++){
		      int count = 1;
		      for(int j = i+1; j < r; j++){
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