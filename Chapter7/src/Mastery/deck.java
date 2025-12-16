package Mastery;

import java.util.Random;

public class deck 
{
	private Random rand = new Random();
	
	public card dealCard() {
        int rank = rand.nextInt(13) + 1;
        return new card(rank);
	}
}
