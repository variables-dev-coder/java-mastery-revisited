package day02_Core_Java_Fundamentals;

public class WrapperParseDemo {

    public static void main(String[] args) {

        String a = "100";
        String b = "200";

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        System.out.println("Sum = " + (x + y));  // Sum = 300
    }
}
