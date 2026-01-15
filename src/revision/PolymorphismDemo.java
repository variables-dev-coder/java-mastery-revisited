package revision;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a = new Dog();   // runtime polymorphism
        a.sound();
    }
}

