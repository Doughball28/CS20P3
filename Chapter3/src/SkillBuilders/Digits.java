package SkillBuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		
		//ask for number
		System.out.print("enter a two-digit number: ");
		int number = scanner.nextInt();
		
		
		//get the digits
		int tens = number / 10;
		int ones = number % 10;
		
		//display
		System.out.println("Tens place: " + tens);
		System.out.println("Ones place: " + ones);
		
		scanner.close();
	}

}
