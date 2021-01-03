
public class MyCraps {

	public static void main(String[] args) {
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		Rule rule1 = new Rule(dice1, dice2);
		
		System.out.println("You rolled "+dice1.getFace()+" + "+dice2.getFace()+" = "+(dice1.getFace()+dice2.getFace()));
		System.out.println(rule1.firstRoll());
		
	}

}
