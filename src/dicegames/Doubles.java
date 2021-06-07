package dicegames;

public class Doubles {

	public Doubles()
	{
		System.out.println("\n-----\nRoll doubles to win! (get the same number on both dice)\n");
		
		Dice d = DiceRoller.rolldice();
		System.out.println("\nYour roll: "+d.getPrint());
		
		if (d.diceone == d.dicetwo) System.out.println("You won!");
		else System.out.println("You lost!");
	}
}
