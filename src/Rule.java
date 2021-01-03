public class Rule {
	Dice dice1;
	Dice dice2;
	int myPoint;
	public Rule(Dice dice1, Dice dice2) {
		this.dice1 = dice1;
		this.dice2 = dice2;
		myPoint = dice1.getFace() + dice2.getFace();
	}
	
	public String firstRoll() {
		if(myPoint == 2 || myPoint == 3 || myPoint == 12){
			return "You Lose";
		}
		else if(myPoint == 7 || myPoint == 11) {
			return "You Win";
		}
		else {
			return "point is " + myPoint + "\n" + nextRoll();
		}
	}
	
	public String nextRoll() {
		dice1.rollDice();
		dice2.rollDice();
		
		int sum = dice1.getFace()+dice2.getFace();
		
		if(sum == myPoint) {
			return "point is " + sum + "\n"+"You Win";
		}
		else if(sum == 7) {
			return "point is " + sum + "\n"+"You Lose";
		}
		else {
			return "point is " + sum + "\n" + nextRoll();
		}
	}
}
