package day02_Core_Java_Fundamentals;

public class StringDemo {
    public static void main(String[] args) {

        String s = "Java";
        s = s.concat(" Dev");
        System.out.println(s);  // Java Dev

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Dev");
        System.out.println(sb); // Java Dev
    }
}
