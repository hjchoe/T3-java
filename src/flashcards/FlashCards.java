package flashcards;

import java.io.*;
import java.util.*;

public class FlashCards
{
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	private static Random rand = new Random();
	
	private static String[] terms;
	private static String[] definitions;
	private static int numofcards;
	
	public static void main(String[] args) throws IOException
	{
		requestnumofcards();
		makecards();
		studycards();
	}
	
	private static void requestnumofcards() throws IOException
	{
		System.out.println("How many flash cards would you like to make?");
		System.out.flush();
		numofcards = Integer.valueOf(stdin.readLine());
		terms = new String[numofcards];
		definitions = new String[numofcards];
	}
	
	private static void makecards() throws IOException
	{
		for (int i = 0; i < numofcards; i++)
		{
			System.out.println("\nCard "+Integer.toString(i+1));
			System.out.println("\nEnter term: ");
			System.out.flush();
			terms[i] = stdin.readLine();
			System.out.println("Enter definition: ");
			System.out.flush();
			definitions[i] = stdin.readLine();
		}
	}
	
	private static void studycards() throws IOException
	{
		Boolean state = true;
		System.out.println("\nNow we are going to study the cards, enter the correct term to each definition. Type 'quit' to exit at any time");
		while (state)
		{
			int index = rand.nextInt(numofcards);
			System.out.println("\nDefinition: "+definitions[index]);
			System.out.print("Term: ");
			System.out.flush();
			String term = stdin.readLine();
			if (term.equals("quit"))
			{
				System.out.println("\nOkay bye!");
				state = false;
			}
			else if (term.equals(terms[index])) System.out.println("\nGood job!");
			else System.out.println("Incorrect, the correct answer is: " + terms[index]);
		}
	}
}
