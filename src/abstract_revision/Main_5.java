package abstract_revision;

abstract class Employee {

    int employeeId = 101;

    static String company = "ABC Technologies";

    final double bonus = 5000;

    abstract void work();

    void display() {

        System.out.println(employeeId);
        System.out.println(company);
        System.out.println(bonus);
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes Java code");
    }
}

public class Main_5 {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.display();
        developer.work();
    }
}
