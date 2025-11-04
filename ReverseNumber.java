import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversed = 0;  // variable to store the reversed number

        // Use while loop to reverse the number
        while (number != 0) {
            int digit = number % 10;         // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number = number / 10;             // remove last digit
        }

        // Display the reversed number
        System.out.println("Reversed Number: " + reversed);

        // Close the scanner
        scanner.close();
    }
}
