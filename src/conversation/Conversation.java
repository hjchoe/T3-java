// Assignment 1.3

package conversation;

import java.io.*;

public class Conversation
{
	public static void main (String[] args) throws IOException
	{
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("What is your name?\n");
    System.out.flush();
    String name = stdin.readLine();
    System.out.println("\nHey " + name + " nice to meet you!\n");
    
    System.out.println("What town do you live in?\n");
    System.out.flush();
    String town = stdin.readLine();
    System.out.println("\nNice, " + town + " is a great place to live.\n");
    
    System.out.println("What is your age?\n");
    System.out.flush();
    String age = stdin.readLine();
    int age_num = Integer.valueOf(age);
    int myage = 17;
    String diff = Integer.toString(Math.abs(myage-age_num));
    System.out.println("\nOh I'm 17, we're only " + diff + " year(s) apart.\n");

    System.out.println("Well it was nice talking to you, but I have to go. Talk to you some other time.");
	}
}