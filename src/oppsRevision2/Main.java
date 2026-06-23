package oppsRevision2;

class Employee {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.id = 101;
        e1.name = "Munna";

        e1.display();
    }
}
