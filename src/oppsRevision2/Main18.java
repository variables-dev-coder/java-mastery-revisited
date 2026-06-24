package oppsRevision2;

class Student18 {

    String name;

    Student18(String name) {
        this.name = name;
    }
}

class College {

    void printStudent(Student18 s) {

        System.out.println(
                "Student Name: "
                        + s.name
        );
    }
}

public class Main18 {

    public static void main(String[] args) {

        Student18 s = new Student18("Munna");

        College c = new College();

        c.printStudent(s);
    }
}
