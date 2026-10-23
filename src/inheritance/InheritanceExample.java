package inheritance;


class Animal {

    String name = "Dog";

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        Dog dog = new Dog();

        // Inherited property
        System.out.println(dog.name);

        // Inherited methods
        dog.eat();
        dog.sleep();

        // Child class method
        dog.bark();
    }
}

