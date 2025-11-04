import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit (up to which Fibonacci series should be generated): ");
        int limit = scanner.nextInt();

        int first = 0, second = 1; // first two numbers of Fibonacci series
        int next = 0;

        System.out.print("\nFibonacci Series up to " + limit + ": ");

        // Display first two terms
        System.out.print(first + " " + second);

        // Use do-while loop to generate next numbers
        do {
            next = first + second;
            if (next > limit)
                break; // stop if next number exceeds limit

            System.out.print(" " + next);

            // move ahead in the series
            first = second;
            second = next;

        } while (next <= limit);

        // close the scanner
        scanner.close();
    }
}
