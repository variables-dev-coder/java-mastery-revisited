package revision_String;

import java.nio.charset.StandardCharsets;

public class StringMethods21To25 {

    public static void main(String[] args) {

        // ========================================
        // 21. replaceFirst()
        // ========================================

        String s1 = "Java Java Java";

        String result1 = s1.replaceFirst("Java", "Python");

        System.out.println("replaceFirst(): " + result1);


        // ========================================
        // 22. replaceAll()
        // ========================================

        String s2 = "Java Java Java";

        String result2 = s2.replaceAll("Java", "Python");

        System.out.println("replaceAll(): " + result2);


        // ========================================
        // 23. matches()
        // ========================================

        String s3 = "12345";

        boolean result3 = s3.matches("\\d+");

        System.out.println("matches(): " + result3);


        // ========================================
        // 24. getBytes()
        // ========================================

        String s4 = "Java";

        byte[] bytes = s4.getBytes(StandardCharsets.UTF_8);

        System.out.print("getBytes(): ");

        for (byte b : bytes) {
            System.out.print(b + " ");
        }

        System.out.println();


        // ========================================
        // 25. codePointAt()
        // ========================================

        String s5 = "Java";

        int codePoint = s5.codePointAt(0);

        System.out.println("codePointAt(): " + codePoint);
    }
}
