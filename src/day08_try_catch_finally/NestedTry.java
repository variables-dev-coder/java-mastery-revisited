package day08_try_catch_finally;

public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}

// Inner catch

//No exception        → try → finally
//Exception handled   → try → catch → finally
//Exception unhandled → try → finally → crash
//return in try       → finally → return
//System.exit()       → finally skipped