package wrapperClassRevision;

public class WrapperExample6 {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 100;

        Integer c = 1000;
        Integer d = 1000;

        // == compares references
        System.out.println(a == b);
        System.out.println(c == d);

        // equals() compares values
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }
}
