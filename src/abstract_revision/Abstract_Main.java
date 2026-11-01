package abstract_revision;

abstract class Animal {

    // abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog is barking...");
    }
}


public class Abstract_Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();

    }
}
