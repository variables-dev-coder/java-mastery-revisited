package revision4;

public class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public double calculateAnnualSalary(double bonus) {
        return (salary * 12) + bonus;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
    }
}
