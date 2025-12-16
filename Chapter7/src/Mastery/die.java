package Mastery;


import java.util.Random;

public class die 
{
	public int value;
	public Random rand = new Random();
	
	
	public die()
	{
		value = 1;
	}
	
	public void roll() 
	{
        value = rand.nextInt(6) + 1;
    }
	
	public int getValue() 
	{
        return value;
    }
}
