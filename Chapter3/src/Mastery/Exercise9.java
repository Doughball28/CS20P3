package Mastery;
import java.util.Scanner;
public class Exercise9 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//get time
		System.out.println("enter time in minutes: ");
		int number = scanner.nextInt();
		//calculate new time
		int numberhour = number / 60;
		int numbermin = number % 60;
		//show new time
		System.out.println("the time is: " + numberhour + ":" + numbermin);
		
		
		scanner.close();
	}

}
