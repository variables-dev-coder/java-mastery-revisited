package oppsRevision2;

class Employee2 {

    int id;
    String name;

    Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display2() {
        System.out.println(id + " " + name);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Employee2 e =
                new Employee2(101, "Munna");

        e.display2();
    }
}
