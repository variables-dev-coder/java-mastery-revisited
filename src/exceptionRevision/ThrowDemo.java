package exceptionRevision;

public class ThrowDemo {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be >= 18");
        }
    }
    public static void main(String[] args) {
        validateAge(15);
    }
}

