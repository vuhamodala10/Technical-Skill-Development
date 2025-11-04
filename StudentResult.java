import java.util.Scanner;

class Student {
    private String name;
    private int mark1, mark2, mark3;

    // Constructor
    public Student(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to calculate total
    public int getTotal() {
        return mark1 + mark2 + mark3;
    }

    // Method to calculate percentage
    public double getPercentage() {
        return getTotal() / 3.0;
    }

    // Method to display result
    public void displayResult() {
        double percentage = getPercentage();
        System.out.println("\n🎓 Student Name: " + name);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + getTotal());
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Optional: Grade based on percentage
        if (percentage >= 90) {
            System.out.println("Grade: A+ 🌟");
        } else if (percentage >= 75) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F ❌");
        }
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in 3 subjects (out of 100): ");
        int mark1 = scanner.nextInt();
        int mark2 = scanner.nextInt();
        int mark3 = scanner.nextInt();

        // Create student object and show result
        Student student = new Student(name, mark1, mark2, mark3);
        student.displayResult();

        scanner.close();
    }
}
