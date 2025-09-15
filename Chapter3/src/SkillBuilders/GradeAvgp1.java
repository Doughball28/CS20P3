package SkillBuilders;
import java.util.Scanner;
public class GradeAvgp1 {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//enter grades
		System.out.print("enter your first grade: " );
		int G1 = scanner.nextInt();
		System.out.print("enter your Second grade: " );
		int G2 = scanner.nextInt();
		System.out.print("enter your third grade: " );
		int G3 = scanner.nextInt();
		System.out.print("enter your fourth grade: " );
		int G4 = scanner.nextInt();
		System.out.print("enter your fifth grade: " );
		int G5 = scanner.nextInt();
		//find average
		int avg = (G1 + G2 + G3 + G4 + G5) / 5;
		//display
		System.out.print("Your average is: " + avg);
		
		scanner.close();
	}

}
