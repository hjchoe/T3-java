// Assignment 1.2

package echo;

import java.io.*;

public class Echo
{
	public static void main (String[] args) throws IOException
	{

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String message;

    System.out.print("Enter the message: ");
    System.out.flush();
    message = stdin.readLine();

    System.out.print("You "); 
    System.out.println("entered: " + message);
    
	}
}