package polymorphism;


class Employee12 {

    private String name;

    Employee12(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    double calculateSalary() {
        return 0;
    }
}

class Developer12 extends Employee12 {

    Developer12(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 50000;
    }
}

class Manager12 extends Employee12 {

    Manager12(String name) {
        super(name);
    }

    @Override
    double calculateSalary() {
        return 80000;
    }
}

class SalaryService {

    void generateSalary(Employee12 employee) {

        System.out.println("Employee: " +
                employee.getName());

        System.out.println("Salary: ₹" +
                employee.calculateSalary());

        System.out.println("----------------");
    }
}

public class Main_12 {

    public static void main(String[] args) {

        SalaryService service = new SalaryService();

        Employee12 developer = new Developer12("Rahul");
        Employee12 manager = new Manager12("Amit");

        service.generateSalary(developer);
        service.generateSalary(manager);
    }
}

