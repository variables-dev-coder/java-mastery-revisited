package polymorphism;


class Employee6 {

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee6 {

    @Override
    double calculateSalary() {
        return 30000 + 5000;
    }
}

class PartTimeEmployee extends Employee6 {

    @Override
    double calculateSalary() {
        int hours = 80;
        int hourlyRate = 200;

        return hours * hourlyRate;
    }
}

public class Main_6 {

    public static void main(String[] args) {

        Employee6 employee;

        employee = new FullTimeEmployee();
        System.out.println("Full-time Salary: " +
                employee.calculateSalary());

        employee = new PartTimeEmployee();
        System.out.println("Part-time Salary: " +
                employee.calculateSalary());
    }
}

