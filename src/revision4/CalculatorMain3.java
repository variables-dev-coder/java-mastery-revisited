package revision4;

public class CalculatorMain3 {

    public static void main(String[] args) {

        Calculator3 calculator3 = new Calculator3();

        System.out.println(calculator3.add(10, 20));

        System.out.println(calculator3.add(10.5, 20.5));

        System.out.println(calculator3.add(10, 20, 30));

        System.out.println(calculator3.multiply(5, 4));

        System.out.println(calculator3.multiply(2.5, 4.0));
    }
}
