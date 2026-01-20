package exceptionRevision;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally always runs");
        }
    }
}

//finally executes
//Even on exception