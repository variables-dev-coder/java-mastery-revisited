package abstract_revision;

interface A {

    default void display() {

        System.out.println("Interface A");
    }
}

interface B {

    default void display() {

        System.out.println("Interface B");
    }
}

class C implements A, B {

    @Override
    public void display() {

        System.out.println("Class C");

        A.super.display();

        B.super.display();
    }
}

public class Main_12 {

    public static void main(String[] args) {

        C obj = new C();

        obj.display();
    }
}
