package polymorphism;


class Animal {

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog eats food");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main_2 {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.eat();

        // animal.bark(); // Compile-time error
    }
}

