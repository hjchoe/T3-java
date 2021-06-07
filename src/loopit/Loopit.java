package loopit;

import java.io.*; 

class Loopit {
	public static void main (String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int count, max = 1, num = 0;
		
		while (num != -1)
		{
			System.out.print ("\nEnter a number to factorialize (-1 to quit): \n");
			System.out.flush();
			num = Integer.parseInt(stdin.readLine());
			
			if (num == -1) System.out.println("\nProgram terminated.");
			
			else
			{
				for (count = 1; count <= num; count++) max = count * max;
				System.out.println ("\nFactorial of " + num + " is: " + max);
		    }
		} 
	}
} 