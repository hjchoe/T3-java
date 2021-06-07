package dicegames;

import java.io.*;
import java.util.*;

public class DiceGames {
	public static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	private static Boolean state = true;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException
	{
		while (state)
		{
			System.out.println("\nWhat dice game would you like to play? ('quit' to exit)\n1 - DiceTimes\n2 - EvensOdds\n3 - Doubles");
			System.out.flush();
			String choice = stdin.readLine();
			if (choice.equals("1"))
			{
				DiceTimes dt = new DiceTimes();
			}
			else if (choice.equals("2"))
			{
				EvensOdds eo = new EvensOdds();
			}
			else if (choice.equals("3"))
			{
				Doubles ds = new Doubles();
			}
			else if (choice.equals("quit"))
			{
				state = false;
			}
			else System.out.println("Invalid Choice");
		}
	}
}