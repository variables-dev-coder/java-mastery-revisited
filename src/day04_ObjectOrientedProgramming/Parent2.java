package day04_ObjectOrientedProgramming;

public class Parent2 {
    static void show() {
        System.out.println("Parent2 static");
    }
}

class Child2 extends Parent2 {
    static void show() {
        System.out.println("Child2 static");
    }

    public static void main(String[] args) {
        Parent2 p2 = new Child2();
        p2.show(); // Parent2 static
    }
}