package dicegames;

import java.util.*;

public class DiceRoller {
	private static Random rand = new Random();
	public static Dice d;

	public DiceRoller()
	{
		d = rolldice();
		System.out.println(d.getPrint());
	}

	public static Dice rolldice()
	{
		int diceone = rand.nextInt(6) + 1;
		int dicetwo = rand.nextInt(6) + 1;
		Dice newDice = new Dice(diceone, dicetwo);
		return newDice;
	}
}


