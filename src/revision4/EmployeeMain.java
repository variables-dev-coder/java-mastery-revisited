package revision4;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Munna", 20000);

        employee.display();

        System.out.println(
                employee.calculateAnnualSalary()
        );

        System.out.println(employee.calculateAnnualSalary(50000));
    }
}
