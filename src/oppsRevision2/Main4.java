package oppsRevision2;

class Animal {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barking");
    }
}

public class Main4 {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.bark();
    }
}
