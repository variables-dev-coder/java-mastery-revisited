package abstract_revision;

//Abstract Class Reference with Child Object

abstract class Animal3 {

    // abstract method
    abstract void sound();
}

class Dog3 extends Animal3 {

    void sound() {
        System.out.println("Dog3 is barking");
    }
}
public class Main_3 {

    public static void main(String[] args) {

        Dog3 dg = new Dog3();
        dg.sound();
    }
}
