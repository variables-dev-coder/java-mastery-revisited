package revision_stack_heap;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PersonMain {

    static void display(Person p) {

        int number = 100;

        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        Person person = new Person("Aziz", 25);

        display(person);
    }

}
