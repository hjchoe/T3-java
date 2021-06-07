package miles_to_kilometers;

import java.io.*;

public class MilesTOKilometers {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("Miles to Kilometers Converter\n\n##############################\n");
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Enter miles: \n");
	    System.out.flush();
	    String miles_string = stdin.readLine();
	    
	    double miles = Double.valueOf(miles_string);
	    double kilometers = miles * 1.609344;
	    
	    System.out.println("\n" + miles + " miles is " + kilometers + " kilometers.");
	}

}
