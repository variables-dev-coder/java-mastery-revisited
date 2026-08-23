package revision4;

public class ParameterOrderOverloding {

    static void test(int x) {
        System.out.println("int");
    }

    static void test(double x) {
        System.out.println("double");
    }

    public static void main(String[] args) {

        test(10);
        test(10.5);
        test('A');
    }
}
