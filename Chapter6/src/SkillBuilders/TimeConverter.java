package SkillBuilders;
import java.util.Scanner;

public class TimeConverter {

    // Convert hours to minutes
    public static double hoursToMinutes(double hours) {
        return hours * 60;
    }

    // Convert days to hours
    public static double daysToHours(double days) {
        return days * 24;
    }

    // Convert minutes to hours
    public static double minutesToHours(double minutes) {
        return minutes / 60;
    }

    // Convert hours to days
    public static double hoursToDays(double hours) {
        return hours / 24;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Time Converter");
        System.out.println("Choose a conversion type:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Enter your choice (1–4): ");
        int choice = input.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = input.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = hoursToMinutes(value);
                System.out.println(value + " hours = " + result + " minutes");
                break;
            case 2:
                result = daysToHours(value);
                System.out.println(value + " days = " + result + " hours");
                break;
            case 3:
                result = minutesToHours(value);
                System.out.println(value + " minutes = " + result + " hours");
                break;
            case 4:
                result = hoursToDays(value);
                System.out.println(value + " hours = " + result + " days");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
