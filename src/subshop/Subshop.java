package subshop;

import java.util.*;

public class Subshop
{
	public static Scanner scanner = new Scanner(System.in);
	private static Double total_cost = 0.00d;
	private static ArrayList<String> cart = new ArrayList<String>();
	private static Boolean state = true;

	public static void main(String[] args)
	{
		while (state)
		{
			System.out.println("Welcome to James' Sub Shop");
			System.out.println("Please place your order.");
			
			Sandwich sandwich = new Sandwich();
			Drink drink = new Drink();
			Dessert dessert = new Dessert();
			
			total();
			
			System.out.println("\nWould you like to place another order?");
			String choice = scanner.nextLine();
			if (choice.equals("yes"))
			{
				reset();
				continue;
			} else System.out.println("Thank you, come again next time.");
			break;
		}
	}
	
	public static void reset()
	{
		cart.clear();
		total_cost *= 0;
	}
	
	public static void addmenu(String item, double cost)
	{
		cart.add(item+"!@#"+Double.toString(cost));
		total_cost += cost;
	}
	
	public static void total()
	{
		System.out.println("\nYour total comes out to: $" + total_cost);
		System.out.println("Continue with your purchase?");
		String choice = Subshop.scanner.nextLine();
		if (choice.equals("yes"))
		{
			System.out.println("Processing payment...");
			print_receipt();
		} else System.out.println("Cancelled Purchase");
	}
	
	public static void print_receipt()
	{
		System.out.println("\nReceipt:\n");
		for (int i = 0; i < cart.size(); i++)
		{
			String[] itemandprice = cart.get(i).split("!@#");
			String item = itemandprice[0];
			String price = itemandprice[1];
			System.out.println(item + " - " + price);
		}
		total_cost = Math.round(total_cost * 100d) / 100d;
		Double tax = Math.round((0.0625d * total_cost) * 100d) / 100d;
		Double total = Math.round((total_cost + tax) * 100d) / 100d;
		System.out.println("##########\n\nSubtotal: $" + total_cost + "\nTax: $" + tax + "\n-----\nTotal: $" + total);
	}
}