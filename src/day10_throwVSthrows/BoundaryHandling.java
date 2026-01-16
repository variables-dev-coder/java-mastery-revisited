package day10_throwVSthrows;

// Handle exception at correct place

public class BoundaryHandling {

    static void risky() {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            risky();
        } catch (ArithmeticException e) {
            System.out.println("Handled at main boundary");
        }
    }
}

//Practice

//Move try-catch into risky()
//Compare design quality