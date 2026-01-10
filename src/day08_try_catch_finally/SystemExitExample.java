package day08_try_catch_finally;

public class SystemExitExample {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            System.exit(0);
        } finally {
            System.out.println("Finally block");
        }
    }
}

// Try block