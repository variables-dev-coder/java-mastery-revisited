package exceptionRevision;

public class Example17 {

    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block always runs");
        }
    }
}
