package revision_String;

public class StringBufferMethods51To55 {

    public static void main(String[] args) {

        // 51. indexOf(String, fromIndex)
        StringBuffer sb1 = new StringBuffer("Java Python Java C++");

        int result1 = sb1.indexOf("Java", 5);

        System.out.println("indexOf(str, fromIndex): " + result1);


        // 52. lastIndexOf(String, fromIndex)
        StringBuffer sb2 = new StringBuffer("Java Python Java C++");

        int result2 = sb2.lastIndexOf("Java", 12);

        System.out.println("lastIndexOf(str, fromIndex): " + result2);


        // 53. charAt()
        StringBuffer sb3 = new StringBuffer("Java");

        char result3 = sb3.charAt(2);

        System.out.println("charAt(): " + result3);


        // 54. setLength() - reducing length
        StringBuffer sb4 = new StringBuffer("Java Programming");

        sb4.setLength(4);

        System.out.println("setLength(4): " + sb4);


        // 55. setLength() - increasing length
        StringBuffer sb5 = new StringBuffer("Java");

        System.out.println("Before setLength(): " + sb5.length());

        sb5.setLength(10);

        System.out.println("After setLength(): " + sb5.length());
    }
}
