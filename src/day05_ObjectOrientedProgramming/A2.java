package day05_ObjectOrientedProgramming;

interface A2 {
    default void show() {
        System.out.println("A2");
    }
}

interface B2 {
    default void show() {
        System.out.println("B2");
    }
}

class Test implements A2, B2 {
    public void show() {
        A2.super.show(); // resolve conflict
    }

    public static void main(String[] args) {
        new Test().show();
    }
}

// A2