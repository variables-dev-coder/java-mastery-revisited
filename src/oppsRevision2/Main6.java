package oppsRevision2;

class Animal2 {

    void sound2() {
        System.out.println("Animal Sound");
    }
}

class Dog2 extends Animal2 {

    @Override
    void sound2() {
        System.out.println("Dog Bark");
    }
}

public class Main6 {

    public static void main(String[] args) {

        Animal2 a = new Dog2();

        a.sound2();
    }
}
