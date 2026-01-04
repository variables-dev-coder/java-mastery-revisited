package day04_ObjectOrientedProgramming;

public class Animal {

    void sound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();        // Animal Makes Sound
        d.bark();         // Dog barks
    }
}
