package day03_ObjectOrientedProgramming;

public class Test {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.a = 100;
        t1.b = 200;

        System.out.println(t2.a); // 100
        System.out.println(t2.b); // 20
    }
}
