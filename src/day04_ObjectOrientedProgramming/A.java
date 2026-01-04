package day04_ObjectOrientedProgramming;

public interface A {
    void show();
}

interface B {
    void show();
}

class Test implements A, B {
    public void show() {
        System.out.println("Multiple inheritance via interface");
    }

    public static void main(String[] args) {
        new Test().show();
    }
}