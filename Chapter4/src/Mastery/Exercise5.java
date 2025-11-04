package Mastery;
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("enter your percent grade: ");
		int percentage = scan.nextInt();
		
		if (percentage >= 90 && percentage <= 100) 
		{
			System.out.print("Your grade is: A");
		} 
		else if (percentage >= 80 && percentage <= 89) 
		{
            System.out.println("Your grade is: B");
        } 
		else if (percentage >= 70 && percentage <= 79) 
        {
            System.out.println("Your grade is: C");
        } 
        else if (percentage >= 60 && percentage <= 69) 
        {
            System.out.println("Your grade is: D");
        } 
        else if (percentage < 60 && percentage >= 0) 
        {
            System.out.println("Your grade is: F");
        } 
        else 
        {
            System.out.println("Invalid percentage entered.");
        }		
	}

}
//Screen dump
//enter your percent grade: 6
//Your grade is: F
//Screen dump
//enter your percent grade: 87
//Your grade is: B