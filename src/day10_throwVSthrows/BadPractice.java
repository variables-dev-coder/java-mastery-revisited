package day10_throwVSthrows;

// Incorrect Practice

public class BadPractice {

    static void bad() {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            // ignored ❌
        }
        System.out.println("Program continues silently");
    }

    public static void main(String[] args) {
        bad();
    }
}

//Lesson

//Silent failure
//Hidden bugs
//Very bad in production
