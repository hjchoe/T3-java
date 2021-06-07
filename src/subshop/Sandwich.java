package subshop;

public class Sandwich
{
	private static int choice;
	private static String[] menu = {"1. Italian", "2. BLT", "3. Caprese"};
	private static Double[] prices = {6.99d, 5.99d, 4.99d};

	public Sandwich()
	{
		System.out.println("\nSandwich Menu:\n");
		list_menu();
		get_choice();
	}
	
	private static void list_menu()
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.println(menu[i] + " - $" + Double.toString(prices[i]));
		}
	}
	
	private static void get_choice()
	{
		System.out.println("\nWhich sandwich would you like:");
		
		String choice = Subshop.scanner.nextLine();
		if (choice.equals("1") || choice.equals("2") || choice.equals("3"))
		{
			String item = menu[Integer.valueOf(choice)-1].split(" ")[1] + " Sandwich";
			Double cost = prices[Integer.valueOf(choice)-1];
			Subshop.addmenu(item, cost);
			
			System.out.println("\nplaced " + item + " into cart for $" + Double.toString(cost));
		}
		else
		{
			System.out.println("\nincorrect menu item");
		}
	}
}
