package oppsRevision2;

class Student {

    int id;
    String name;

    Student() {
        System.out.println("Default Constructor");
    }

    Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main14 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(101);
        Student s3 = new Student(101, "Munna");
    }
}
