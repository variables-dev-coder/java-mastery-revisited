package oppsRevision2;

class Employee3 {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class Main3 {

    public static void main(String[] args) {

        Employee3 e = new Employee3();

        e.setSalary(50000);

        System.out.println(
                e.getSalary()
        );
    }
}
