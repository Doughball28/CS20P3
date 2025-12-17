package SkillBuilders;
import java.util.Scanner;
public class studentRoster 
{
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int numStudents = input.nextInt();
        input.nextLine(); // clear newline

        // Create array
        String[] students = new String[numStudents];

        // Get student names
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            students[i] = input.nextLine();
        }

        // Display roster
        System.out.println("\nStudent Roster");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        input.close();
    }
}
