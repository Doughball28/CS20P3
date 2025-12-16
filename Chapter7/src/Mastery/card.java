package Mastery;

public class card 
{
	private int rank;
	
	public card(int r)
	{
		rank = r;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public int getValue()
	{
		if (rank >= 11 && rank <= 13)
		{
			return 10;
		}
		if (rank == 1)
		{
			return 11;
		}
		return rank;
		
	}
	
	public String toString()
	{
		switch (rank) 
		{
		case 1:  return "Ace";
        case 11: return "Jack";
        case 12: return "Queen";
        case 13: return "King";
        default: return "" + rank;
		}
	}
}
