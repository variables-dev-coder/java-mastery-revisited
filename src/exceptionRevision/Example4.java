package exceptionRevision;

public class Example4 {
    public static void main(String[] args) {
        try {
            int x = 10 / 2;
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Always executes");
        }
    }
}

