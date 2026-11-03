package abstract_revision;

@FunctionalInterface
interface Calculator13 {

    int add(int a, int b);
}

public class Main_13 {

    public static void main(String[] args) {

        Calculator13 calculator = (a, b) -> a + b;

        System.out.println(calculator.add(10, 20));
    }
}
