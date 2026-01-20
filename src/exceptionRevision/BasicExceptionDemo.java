package exceptionRevision;

public class BasicExceptionDemo {
    public static void main(String[] args) {
        int a = 10 / 0;   // ArithmeticException
        System.out.println("Never executes");
    }
}

//JVM throws exception
//Program crashes
//Fail-fast behavior