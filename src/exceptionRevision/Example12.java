package exceptionRevision;

public class Example12 {

    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        }
    }
}
