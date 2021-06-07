package eightball;

import java.io.*;
import java.util.*;

public class MagicEightBall
{
	private static String[] responses = new String[20];
	private static Boolean state = true;
	private static Scanner scanner = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void main(String[] args) throws FileNotFoundException
	{
		readfile();
		while (state)
		{
			askquestion();
			printanswer();
			playagain();
		}
	}
	
	private static void readfile() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("responses.in"));
	    for (int i = 0; i < 20; i++)
	    {
	        responses[i] = in.nextLine();
	    }
	}
	
	private static void askquestion()
	{
		System.out.println("\nWhat is your question?");
		String choice = scanner.nextLine();
	}
	
	private static void printanswer()
	{
		String response = responses[rand.nextInt(20)];
		System.out.println("\n"+response);
	}
	
	private static void playagain()
	{
		System.out.println("\nWould you like to ask again?");
		String choice = scanner.nextLine();
		if (!choice.equals("yes"))
		{
			System.out.println("\nAlright, goodbye until next time.");
			state = false;
		}
	}
}
