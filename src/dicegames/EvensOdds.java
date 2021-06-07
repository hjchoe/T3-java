package dicegames;

public class EvensOdds {
	
	public EvensOdds()
	{
		System.out.println("\n-----\nRoll the same parity to win! (if the target is even, roll even)\n");
		
		Dice d1 = DiceRoller.rolldice();
		Dice d2 = DiceRoller.rolldice();
		System.out.println("\nTarget Parity: "+d1.parity);
		System.out.println("\nYour roll: "+d2.getPrint());
		if (d1.parity.equals(d2.parity)) System.out.println("You won!");
		else System.out.println("You lost!");
	}
}
