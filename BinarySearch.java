import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements (in any order):");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array (binary search requires sorted data)
        Arrays.sort(arr);

        System.out.println("\nSorted Array: " + Arrays.toString(arr));

        // Ask for the element to search
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        // Perform binary search
        int low = 0, high = size - 1;
        boolean found = false;
        int position = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = true;
                position = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
