package this_and_static_keywords;


class Employee {

    // Instance variables: each employee has their own values
    int id;
    String name;
    double salary;

    // Static variables: shared across all employees
    static String companyName = "TCS";
    static int employeeCount = 0;

    // Default constructor
    Employee() {
        this(0, "Unknown", 0.0);
        System.out.println("Default constructor executed");
    }

    // Parameterized constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        employeeCount++;
    }

    // Instance method
    void displayDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Company: " + Employee.companyName);
        System.out.println("-------------------------");
    }

    // Instance method to increase salary
    void increaseSalary(double amount) {
        this.salary = this.salary + amount;
        System.out.println(this.name + "'s salary increased by " + amount);
    }

    // Static method
    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }

    // Static method
    static void changeCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }
}

public class EmployeeSalaryDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Rahul", 25000);
        Employee e2 = new Employee(102, "Priya", 30000);
        Employee e3 = new Employee(103, "Amit", 35000);

        // Display employee details
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // Increase salary of one employee
        e1.increaseSalary(5000);

        System.out.println("\nAfter salary increase:");
        e1.displayDetails();

        // Display shared employee count
        Employee.displayEmployeeCount();

        // Change the shared company name
        Employee.changeCompanyName("Infosys");

        System.out.println("\nAfter changing company name:");
        e1.displayDetails();
        e2.displayDetails();
    }
}

