// Base class: Person
class Person {
    String name;
    int age;

    void getDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
    }
}

// Derived class: Employee (inherits from Person)
class Employee extends Person {
    int empId;
    double salary;

    void getEmployeeDetails(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println(" Salary: ₹" + salary);
    }
}

// Derived class: Manager (inherits from Employee)
class Manager extends Employee {
    String department;
    double bonus;

    void getManagerDetails(String department, double bonus) {
        this.department = department;
        this.bonus = bonus;
    }

    void displayManagerDetails() {
        System.out.println(" Department: " + department);
        System.out.println(" Bonus: ₹" + bonus);
        System.out.println(" Total Income: ₹" + (salary + bonus));
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Manager object
        Manager mgr = new Manager();

        // Set details
        mgr.getDetails("Nisha", 22);
        mgr.getEmployeeDetails(101, 60000);
        mgr.getManagerDetails("Software Development", 10000);

        // Display all info
        System.out.println("Manager Information \n");
        mgr.displayDetails();
        mgr.displayEmployeeDetails();
        mgr.displayManagerDetails();
    }
}
