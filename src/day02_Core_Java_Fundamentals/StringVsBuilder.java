package day02_Core_Java_Fundamentals;

public class StringVsBuilder {

    public static void main(String[] args) {

        // String (slow)
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s = s + i;
        }

        // StringBuilder (fast)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        System.out.println("Done"); // Done
    }
}


// Why String is slow?
//Immutable → new object each iteration
//StringBuilder modifies same object

//Interview rule:
//Use StringBuilder inside loops.