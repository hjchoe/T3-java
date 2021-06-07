package palindromedetector;

import java.io.*;
import java.util.*;

public class PalindromeDetector
{
	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	private static String original, lowercase, sentence, backwards;

	public static void main(String[] args) throws IOException
	{
		Boolean state = true;
		while (state)
		{
		System.out.println("\nEnter palindrome: ");
		System.out.flush();
		original = stdin.readLine();
		lowercase = original.toLowerCase();
		
		cleanup();
		tobackwards();
		check();
		
		System.out.println("\nCheck for another palindrome?");
		System.out.flush();
		String choice = stdin.readLine();
		if (!choice.equals("yes")) state = false;
		}
		System.out.println("\nSee you later.");
	}

	private static void cleanup()
	{
		StringBuilder strbuild = new StringBuilder();
		for (int i = 0; i < lowercase.length(); i++)
		{
			String letter = lowercase.substring(i, i+1);
			char value = letter.charAt(0);
			if (value <= 122 && value >= 97)
			{
				strbuild.append(letter);
			}
		}
		sentence = strbuild.toString();
		//System.out.println(sentence);
	}
	
	private static void tobackwards()
	{
		StringBuilder strbuild = new StringBuilder();
		for (int i = sentence.length()-1; i >= 0; i--)
		{
			strbuild.append(sentence.substring(i, i+1));
		}
		backwards = strbuild.toString();
		//System.out.println(backwards);
	}
	
	private static void check()
	{
		if (sentence.equals(backwards))
		{
			System.out.println("\n'"+original+"' is a palindrome");
		}
		else
		{
			System.out.println("\n'"+original+"' is not a palindrome");
		}
	}
}
