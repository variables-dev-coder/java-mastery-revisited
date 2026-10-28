package polymorphism;


class Animal1 {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal1 {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main_1 {

    public static void main(String[] args) {

        Animal1 animal;

        animal = new Dog1();
        animal.makeSound();

        animal = new Cat1();
        animal.makeSound();

        animal = new Animal1();
        animal.makeSound();
    }
}

