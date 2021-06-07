package candy;

import java.io.*; 

class Candy {
	public static void main (String[] args) throws IOException
	{
	    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	    int num1, num2, sum;
	    double dollars;
	
	    System.out.print ("How many candy bars do you want: \n");
	    System.out.flush(); 
	    num1 = Integer.parseInt(stdin.readLine());
	
	    System.out.print ("\nHow many suckers you do want: \n");
	    System.out.flush(); 
	    num2 = Integer.parseInt(stdin.readLine());
	
	    sum = num1 + num2;
	    dollars = (double) sum * .75;
	    System.out.println("\nYou owe: $" + dollars);
  }
} 