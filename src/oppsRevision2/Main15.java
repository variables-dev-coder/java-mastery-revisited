package oppsRevision2;

class Calculator15 {

    int add15(int a, int b) {
        return a + b;
    }

    double add15(double a, double b) {
        return a + b;
    }

    int add15(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main15 {

    public static void main(String[] args) {

        Calculator15 c = new Calculator15();

        System.out.println(c.add15(10,20));
        System.out.println(c.add15(10.5,20.5));
        System.out.println(c.add15(1,2,3));
    }
}
