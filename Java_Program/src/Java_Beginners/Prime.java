package Java_Beginners;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
 Boolean m= false;
 for(int i=2;i<=n/2;i--) {
	if(n%1==0) {
		m=true;
	}
 }
 if(!m)
	 System.out.println(n+ " Prime");
 else
	 System.out.println(n+ " Non-Prime");
	}

}
