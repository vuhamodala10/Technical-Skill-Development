import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Use StringBuilder's reverse() method
        String reversed = new StringBuilder(input).reverse().toString();

        // Display the result
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
