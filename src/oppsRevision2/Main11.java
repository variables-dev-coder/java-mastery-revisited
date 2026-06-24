package oppsRevision2;

class Person11 {

    void display11() {
        System.out.println("I am Person");
    }
}

class Employee11 extends Person11 {

    void work11() {
        System.out.println("Employee Working");
    }
}

public class Main11 {

    public static void main(String[] args) {

        Employee11 emp = new Employee11();

        emp.display11();
        emp.work11();
    }
}
