package studio2;


public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startAmount = 2;
		double winChance = 0.5;
		double winLimit = 7;
		
		double winR = 0;
		double loseR = 0;
		int totalSimulations = 5;
		int tries=0;
		
		for (int i=0;i<totalSimulations;i+=1) {
			
			while (startAmount<winLimit && startAmount>0){
				double chance = Math.random();
				if (chance>=winChance){
					startAmount+=1;
					//System.out.println(startAmount);
					tries+=1;
				}
				else {
					startAmount-=1;
					//System.out.println(startAmount);
					tries+=1;
				}
			}
			System.out.println(tries);
			
			if (startAmount==winLimit){
				System.out.println("You won");
				winR+=1;
			}
			else {
				System.out.println("You lost");
				loseR+=1;
			}
			startAmount = 2;
			tries=0;
		}
		
		System.out.println("You won: "+winR+" You lost: "+loseR);
		System.out.println("Lose rate: "+(loseR/totalSimulations));
		

	}

}
