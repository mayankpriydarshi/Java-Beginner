package Java_Beginners;

public class IfElseG {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
playergame();
	}
	private static void playergame() {
		// TODO Auto-generated method stub
		boolean canSeePlayer=true;  // boolean canSeePlayer=false;
		boolean playerPoweredUp = false;
	if(canSeePlayer)	 //if(canSeePlayer==true)
		{
			if(!playerPoweredUp)  //if(playerPoweredUp==false)
			{
				System.out.printf ("Maar Be");
			}
			else {
				System.out.print("Jaldi Bhaag!");
			}
		}
		else {
			System.out.println("Bahute Khub");
		}
	}
}
