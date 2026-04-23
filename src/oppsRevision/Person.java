package oppsRevision;

class Person {

    String name;
    int age;

    // constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person("Munna", 23);
        p.display();
    }
}
