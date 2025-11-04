import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for principal amount
        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();

        // Ask for rate of interest
        System.out.print("Enter Rate of interest (R): ");
        double rate = scanner.nextDouble();

        // Ask for time period in years
        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("\n💰 Simple Interest: " + simpleInterest);

        // Optionally show total amount
        double totalAmount = principal + simpleInterest;
        System.out.println("Total Amount after " + time + " years: " + totalAmount);

        // Close scanner
        scanner.close();
    }
}
