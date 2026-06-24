package oppsRevision2;

class Animal12 {

    void eat12() {
        System.out.println("Eating");
    }
}

class Dog12 extends Animal12 {

    void bark12() {
        System.out.println("Barking");
    }
}

class Puppy12 extends Dog12 {

    void weep12() {
        System.out.println("Weeping");
    }
}

public class Main12 {

    public static void main(String[] args) {

        Puppy12 p = new Puppy12();

        p.eat12();
        p.bark12();
        p.weep12();
    }
}
