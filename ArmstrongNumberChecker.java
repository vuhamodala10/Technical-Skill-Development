import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;
        int n = 0;

        // Find number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        // Calculate sum of powers of digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        // Check if Armstrong number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number! ");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number. ");
        }

        scanner.close();
    }
}
