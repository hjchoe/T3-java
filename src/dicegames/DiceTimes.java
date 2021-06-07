package dicegames;

import java.io.*;

public class DiceTimes {
	private static int num;
	
	public DiceTimes() throws IOException
	{
		System.out.println("\n-----\nRoll dice a certain number of times!");
		
		requestnumofcards();
		System.out.println("\nResults:\n");
		for (int i = 0; i < num; i++)
		{
			Dice d = DiceRoller.rolldice();
			System.out.println("Roll #"+(i+1)+": "+d.diceone+", "+d.dicetwo+", "+d.total);
		}
	}
	
	private static void requestnumofcards() throws IOException
	{
		System.out.println("\nHow many times would you like to roll dice?");
		System.out.flush();
		num = Integer.valueOf(DiceGames.stdin.readLine());
	}
}
