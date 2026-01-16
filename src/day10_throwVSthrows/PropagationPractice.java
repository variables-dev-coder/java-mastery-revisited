package day10_throwVSthrows;

//Observe exception traveling up the stack

public class PropagationPractice {

    static void level3() {
        int a = 10 / 0;
    }

    static void level2() {
        level3();
    }

    static void level1() {
        level2();
    }

    public static void main(String[] args) {

       // level1();

        // handled --------------

        try {
            level1();
        } catch (ArithmeticException e) {
            System.out.println("Handled at main boundary");
        }
    }
}

// Add try-catch in level1
//Observe stack trace change