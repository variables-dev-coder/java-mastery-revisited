package revision4;

public class OverloadMain {

    public static void main(String[] args) {
        System.out.println("Original main");
        main(10);
    }

    static void main(int x) {
        System.out.println("Overloaded main");
    }
}
