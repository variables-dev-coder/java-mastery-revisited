package exceptionRevision;

public class Example5 {
    static void checkAge(int age) {
        if (age < 18)
            throw new IllegalArgumentException("Not eligible");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}

