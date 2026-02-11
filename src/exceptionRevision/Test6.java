package exceptionRevision;

public class Test6 {

    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("abc");
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Invalid input");
        }
    }
}
