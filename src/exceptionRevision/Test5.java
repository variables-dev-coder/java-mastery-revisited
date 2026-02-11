package exceptionRevision;

public class Test5 {

    static void process() throws Exception {
        try {
            int[] arr = new int[2];
            arr[5] = 10;
        } catch (Exception e) {
            System.out.println("Logging exception");
            throw e; // re-throw
        }
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("Handled in main");
        }
    }
}
