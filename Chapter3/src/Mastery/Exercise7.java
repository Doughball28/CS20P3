package Mastery;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		//ask for number
		System.out.print("enter a three digit number: ");
		int number = scanner.nextInt();
		
		
		//get the digits
		int hundreds = number / 100;
		int tens = (number - (hundreds * 100)) / 10;
		int ones = number % 10;
		
		//display
		System.out.println("Hundreds place: " + hundreds);
		System.out.println("Tens place: " + tens);
		System.out.println("Ones place: " + ones);
		
		scanner.close();

	}

}
