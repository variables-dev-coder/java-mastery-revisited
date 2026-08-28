package revision_stack_heap;


class Student3 {

    int age;
}

public class Example3 {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.age = 20;

        Student s2 = s1;

        s2.age = 30;

        System.out.println("s1 age = " + s1.age);
        System.out.println("s2 age = " + s2.age);
    }
}
