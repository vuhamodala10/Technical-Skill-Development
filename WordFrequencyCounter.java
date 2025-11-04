import java.util.HashMap;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert to lowercase and split into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // Use a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // Remove punctuation (optional)
            word = word.replaceAll("[^a-zA-Z0-9]", "");

            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Display the results
        System.out.println("\nWord Frequencies:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        scanner.close();
    }
}
