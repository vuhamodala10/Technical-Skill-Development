import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Use LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        // Build the result string from the set
        StringBuilder result = new StringBuilder();
        for (char c : set) {
            result.append(c);
        }

        System.out.println("String after removing duplicates: " + result);

        scanner.close();
    }
}
