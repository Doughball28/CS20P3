package Mastery;
import java.util.Scanner;
public class DigitsDisplay {

	public static void main(String[] args) 
	{
		// request number
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a non-negative integer: ");
		int numb = input.nextInt();
		//change int number to string
		 String numString = Integer.toString(numb);
		// divide the number into each individual number and output
		System.out.println("the digits of the number are: ");
		for (int i = 0; i < numString.length(); i++) {
            System.out.println(numString.charAt(i));
		}
		
		
	}

}
//Screen dump
//please enter a non-negative integer: 1515111
//the digits of the number are: 
//1
//5
//1
//5
//1
//1
//1

//Screen dump
//please enter a non-negative integer: 45
//the digits of the number are: 
//4
//5
