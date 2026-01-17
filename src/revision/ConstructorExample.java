package revision;

class Employee {
    int id;
    String name;

    Employee() {
        this(0, "Unknown");
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Munna");

        e1.show();
        e2.show();
    }
}

