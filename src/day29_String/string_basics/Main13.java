package day29_String.string_basics;

public class Main13 {

        public static void main(String[] args) {

            String a = "ABC";
            String b = "ABC";
            String c = new String("ABC");

            System.out.println(a == b);
            System.out.println(a == c);
            System.out.println(b == c);

        }
}
