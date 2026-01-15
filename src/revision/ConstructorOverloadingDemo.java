package revision;

class Student {
    int id;
    String name;

    Student() {
        System.out.println("Default constructor");
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Munna");

        System.out.println(s2.id + " " + s2.name);
    }
}

