package Classes_Objects;

class Student {

    String name;
    int age;

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Amit";
        s2.age = 22;

        Student s3 = new Student();
        s3.name = "Priya";
        s3.age = 20;

        s1.display();
        s2.display();
        s3.display();
    }
}
