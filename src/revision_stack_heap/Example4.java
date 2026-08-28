package revision_stack_heap;

class Student4 {

    int age;

    Student4(int age) {
        this.age = age;
    }
}

public class Example4 {

    public static void main(String[] args) {

        Student4 s4 = new Student4(25);

        System.out.println("Before: " + s4.age);

        s4 = null;

        System.out.println("After: " + s4);
    }
}
