package dicegames;

class Dice {
	public int diceone;
	public int dicetwo;
	public int total;
	public String parity;
	
	public Dice(int diceone, int dicetwo)
	{
		this.diceone = diceone;
		this.dicetwo = dicetwo;
		this.total = diceone + dicetwo;
		this.parity = getParity();
	}
	
	private String getParity()
	{
		String answer = total%2==0 ? "even" : "odd";
		return answer;
	}
	
	public String getPrint()
	{
		String print = diceone+", "+dicetwo+", "+total;
		return print;
	}
}