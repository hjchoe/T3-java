package banking;

public class Bank
{
	public static void main (String[] args)
	{ 
	    Bank_Account account = new Bank_Account(150.00d);
	    System.out.println ("Balance: $" + account.current_Account());
	    account.debit_Account(50.30d);
	    System.out.println ("New Balance: $" + account.current_Account());
	}
}

class Bank_Account
{
	private double value_account; 
	
	public Bank_Account(double initial_value)
	{
		value_account = initial_value;
	}
	
	public void debit_Account(double number) {
		value_account = value_account + number;         
	}
	
	public double current_Account() {
		return value_account;
	} 
}