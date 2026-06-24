package oppsRevision2;

class Employee19 {

    static String company =
            "OpenAI";

    String name;

    Employee19(String name) {
        this.name = name;
    }

    void display19() {

        System.out.println(
                name + " " + company
        );
    }
}

public class Main19 {

    public static void main(String[] args) {

        Employee19 e1 = new Employee19("Munna");

        Employee19 e2 = new Employee19("Rahul");

        e1.display19();
        e2.display19();
    }
}
