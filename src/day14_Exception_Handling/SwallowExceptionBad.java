package day14_Exception_Handling;

public class SwallowExceptionBad {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            // swallowed
        }
        System.out.println("Program continues silently");
    }
}

