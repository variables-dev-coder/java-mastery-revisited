package SOLID_Principles_Intro_level;

// Open/Closed Principle (OCP)

// Example 2: Employee Salary Calculation

interface SalaryCalculator {
    double calculateSalary(double basicSalary);
}

class PermanentEmployee implements SalaryCalculator {

    @Override
    public double calculateSalary(double basicSalary) {
        return basicSalary + (basicSalary * 0.20);
    }
}

class ContractEmployee implements SalaryCalculator {

    @Override
    public double calculateSalary(double basicSalary) {
        return basicSalary;
    }
}

class InternEmployee implements SalaryCalculator {

    @Override
    public double calculateSalary(double basicSalary) {
        return basicSalary * 0.80;
    }
}

class PayrollService {

    public void processSalary(SalaryCalculator calculator, double salary) {
        System.out.println(calculator.calculateSalary(salary));
    }
}

public class Main_5 {
    public static void main(String[] args) {

        PayrollService payroll = new PayrollService();

        payroll.processSalary(new PermanentEmployee(), 30000);
        payroll.processSalary(new ContractEmployee(), 30000);
        payroll.processSalary(new InternEmployee(), 30000);
    }
}
