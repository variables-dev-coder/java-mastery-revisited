package revision4;

public class ParameterTypes {

    static void print(int value) {
        System.out.println("Integer: " + value);
    }

    static void print(double value) {
        System.out.println("Double: " + value);
    }

    static void print(String value) {
        System.out.println("String: " + value);
    }

    public static void main(String[] args) {

        print(10);
        print(10.5);
        print("Hello");
    }
}
