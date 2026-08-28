package revision_stack_heap;


class Employee {

    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Example5 {

    static void display(Employee e) {

        int bonus = 5000;

        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Aziz", 50000);

        display(emp);
    }
}
