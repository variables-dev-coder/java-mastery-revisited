package day04_ObjectOrientedProgramming;

public class Parent {
    int x = 10;
    Parent() {
        System.out.println("Parent constructor");
    }
    void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    int x = 20;

    Child() {
        super();
        System.out.println("Child constructor");
    }
    void show() {
        super.show();
        System.out.println("Child show");
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
//Parent constructor
//Child constructor
//Parent show
//Child show
//10