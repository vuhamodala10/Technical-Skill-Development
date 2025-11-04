import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // Handle edge cases
        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            // Check divisibility using a for loop
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number! ✨");
        } else {
            System.out.println(num + " is NOT a Prime Number. ❌");
        }

        // Close the scanner
        scanner.close();
    }
}
