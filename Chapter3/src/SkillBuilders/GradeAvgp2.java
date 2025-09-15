package SkillBuilders;
import java.util.Scanner;
public class GradeAvgp2 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int totalgrade = 5;
		int sum = 0;
		//enter grades
		System.out.print("enter your first grade: " );
		sum += scanner.nextInt();
		System.out.print("enter your Second grade: " );
		sum += scanner.nextInt();
		System.out.print("enter your third grade: " );
		sum += scanner.nextInt();
		System.out.print("enter your fourth grade: " );
		sum += scanner.nextInt();
		System.out.print("enter your fifth grade: " );
		sum += scanner.nextInt();
		//find average
		double avg = sum / (double) totalgrade;
		//display
		System.out.print("Your average is: " + avg + ("%"));
		
		scanner.close();
	}

}
