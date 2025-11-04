import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Normalize the string: remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(str).reverse().toString();

        // Check if palindrome
        if (str.equals(reversed)) {
            System.out.println(" The string is a palindrome!");
        } else {
            System.out.println(" The string is not a palindrome.");
        }

        scanner.close();
    }
}
