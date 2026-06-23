package oppsRevision2;

class Department {

    String name;

    Department(String name) {
        this.name = name;
    }
}

class Employee9 {

    String name;
    Department dept;

    Employee9(String name,
             Department dept) {

        this.name = name;
        this.dept = dept;
    }

    void display() {
        System.out.println(
                name + " -> " + dept.name
        );
    }
}

public class Main9 {

    public static void main(String[] args) {

        Department d = new Department("IT");

        Employee9 e = new Employee9("Munna", d);

        e.display();
    }
}
