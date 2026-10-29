package polymorphism;

class Animal3 {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog3 extends Animal3 {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Method_overriding {

    public static void main(String[] args) {

        Animal3 animal = new Animal3();
        animal.makeSound();

        Dog3 dog = new Dog3();
        dog.makeSound();
    }
}
