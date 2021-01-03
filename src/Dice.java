import java.security.SecureRandom;
public class Dice {
	
	SecureRandom randomNumbers = new SecureRandom();
	
	private int face = 1 + randomNumbers.nextInt(6);
	
	Dice(){;}
	
	public  int getFace() {
		return face;
	}
	public void rollDice() {
		face = 1 + randomNumbers.nextInt(6);
	}
}
