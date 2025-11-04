import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Ask for the element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform linear search
        boolean found = false;
        int position = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true;
                position = i; // store the index
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("\nElement " + key + " found at position: " + (position + 1));
        } else {
            System.out.println("\nElement " + key + " not found in the array.");
        }

        scanner.close();
    }
}
