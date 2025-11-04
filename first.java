import java.util.Scanner;

public class WelcomeUser {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // For the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // For the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display welcome message
        System.out.println("\nWelcome, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
