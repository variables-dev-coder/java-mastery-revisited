package exceptionRevision;

public class Example16 {

    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}
