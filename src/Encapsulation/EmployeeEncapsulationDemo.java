package Encapsulation;

class Employee {

    // 1. Private data members
    private int employeeId;
    private String employeeName;
    private double monthlySalary;

    // 2. Constructor
    public Employee(int employeeId, String employeeName,
                    double monthlySalary) {

        this.employeeId = employeeId;
        setEmployeeName(employeeName);
        setMonthlySalary(monthlySalary);
    }

    // 3. Getter for employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // 4. Getter for employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // 5. Setter for employee name
    public void setEmployeeName(String employeeName) {
        if (employeeName != null && !employeeName.isBlank()) {
            this.employeeName = employeeName;
        } else {
            System.out.println("Invalid employee name!");
        }
    }

    // 6. Getter for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // 7. Setter with validation
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println(
                    "Salary must be greater than zero!"
            );
        }
    }

    // 8. Calculate annual salary
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // 9. Display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " +
                calculateAnnualSalary());
    }
}

public class EmployeeEncapsulationDemo {

    public static void main(String[] args) {

        // Create an employee object
        Employee emp = new Employee(101, "Munna", 25000);

        System.out.println("=== Employee Details ===");
        emp.displayDetails();

        // Update employee information
        System.out.println("\n=== Update Salary ===");
        emp.setMonthlySalary(30000);
        System.out.println(
                "Updated Salary: " + emp.getMonthlySalary()
        );

        // Try invalid salary
        System.out.println("\n=== Invalid Salary ===");
        emp.setMonthlySalary(-5000);

        // Salary remains unchanged
        System.out.println(
                "Current Salary: " + emp.getMonthlySalary()
        );

        // Update employee name
        System.out.println("\n=== Update Name ===");
        emp.setEmployeeName("Rahul");
        System.out.println(
                "Updated Name: " + emp.getEmployeeName()
        );
    }
}
