package abstract_revision;

abstract class Employee15 {

    private int id;
    private String name;

    Employee15(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee15 {

    private double monthlySalary;

    PermanentEmployee(int id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary + 5000;
    }
}

class ContractEmployee extends Employee15 {

    private int workingDays;
    private double dailyRate;

    ContractEmployee(int id, String name, int days, double rate) {
        super(id, name);
        this.workingDays = days;
        this.dailyRate = rate;
    }

    @Override
    double calculateSalary() {
        return workingDays * dailyRate;
    }
}

public class Main_15 {

    public static void main(String[] args) {

        Employee15 e1 = new PermanentEmployee(101, "Rahul", 40000);

        Employee15 e2 = new ContractEmployee(102, "Amit", 20, 1500);

        e1.displayDetails();

        System.out.println("----------------");

        e2.displayDetails();
    }
}
