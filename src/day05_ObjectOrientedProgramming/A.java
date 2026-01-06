package day05_ObjectOrientedProgramming;

interface A {
    void show();
}

interface B {
    void show();
}

class Demo implements A, B {
    public void show() {
        System.out.println("Multiple inheritance achieved");
    }

    public static void main(String[] args) {
        new Demo().show();
    }
}

