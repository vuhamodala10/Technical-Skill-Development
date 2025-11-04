import java.util.Scanner;

class Employee {
    String name, designation;
    int empId;
    double basicSalary, hra, da, pf, totalSalary;

    // Method to accept and display employee details
    void empDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.println("\n Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Salary: ₹" + basicSalary);
    }

    // Method to compute basic salary components
    void salary() {
        hra = 0.20 * basicSalary; // House Rent Allowance = 20%
        da  = 0.10 * basicSalary; // Dearness Allowance = 10%
        pf  = 0.08 * basicSalary; // Provident Fund = 8%

        System.out.println("\n Salary Breakdown:");
        System.out.println("HRA (20%): ₹" + hra);
        System.out.println("DA  (10%): ₹" + da);
        System.out.println("PF  (8%):  ₹" + pf);
    }

    // Method to compute total salary
    void total() {
        totalSalary = basicSalary + hra + da - pf;
        System.out.println("\n Total Salary (after deductions): ₹" + totalSalary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.empDetails(); // Accept & show details
        emp.salary();     // Calculate components
        emp.total();      
    }
}
