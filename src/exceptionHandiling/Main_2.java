package exceptionHandiling;

public class Main_2 {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {

            System.out.println(e.getMessage());

            System.out.println(e.toString());

            e.printStackTrace();
        }
    }
}
