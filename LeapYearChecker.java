import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;  // Divisible by 400 → leap year
        } else if (year % 100 == 0) {
            isLeap = false; // Divisible by 100 but not 400 → not a leap year
        } else if (year % 4 == 0) {
            isLeap = true;  // Divisible by 4 → leap year
        } else {
            isLeap = false; // All other years → not a leap year
        }

        // Display the result
        if (isLeap) {
            System.out.println(year + " is a Leap Year! ");
        } else {
            System.out.println(year + " is NOT a Leap Year. ");
        }

        // Close the scanner
        scanner.close();
    }
}
