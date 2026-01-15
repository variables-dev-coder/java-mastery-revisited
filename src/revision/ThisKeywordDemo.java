package revision;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Person p = new Person("Munna");
        p.show();
    }
}

