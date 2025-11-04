import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get matrix size
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Step 2: Input matrix elements
        System.out.println("\nEnter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Step 3: Display matrix
        System.out.println("\nThe Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Step 4: Find sum of diagonal elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        // Step 5: Display result
        System.out.println("\n Sum of Diagonal Elements = " + sum);

        scanner.close();
    }
}
