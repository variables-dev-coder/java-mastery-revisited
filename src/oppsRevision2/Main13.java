package oppsRevision2;

class Animal13 {

    void sound13() {
        System.out.println("Animal Sound");
    }
}

class Dog13 extends Animal13 {

    @Override
    void sound13() {
        System.out.println("Dog Bark");
    }
}

class Cat13 extends Animal13 {

    @Override
    void sound13() {
        System.out.println("Cat Meow");
    }
}

public class Main13 {

    public static void main(String[] args) {

        Animal13 a1 = new Dog13();
        Animal13 a2 = new Cat13();

        a1.sound13();
        a2.sound13();
    }
}
