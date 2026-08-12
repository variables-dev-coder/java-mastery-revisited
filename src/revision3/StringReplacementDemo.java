package revision3;

public class StringReplacementDemo {

    public static void main(String[] args) {

        String str = "Java123 Java456";

        // 1. Replace character
        String result1 = str.replace('a', 'A');

        // 2. Replace exact String
        String result2 = str.replace("Java", "Python");

        // 3. Replace first occurrence
        String result3 = str.replaceFirst("Java", "Python");

        // 4. Replace all digits
        String result4 = str.replaceAll("[0-9]", "");

        System.out.println("Original              : " + str);
        System.out.println("replace(char,char)    : " + result1);
        System.out.println("replace(String,String): " + result2);
        System.out.println("replaceFirst()        : " + result3);
        System.out.println("replaceAll()          : " + result4);
    }
}
