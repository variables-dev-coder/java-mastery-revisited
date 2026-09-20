package revision_String;

public class StringBufferMethods46To50 {

    public static void main(String[] args) {

        // 46. substring(start)
        StringBuffer sb1 = new StringBuffer("Java Programming");

        String result1 = sb1.substring(5);

        System.out.println("substring(start): " + result1);


        // 47. substring(start, end)
        StringBuffer sb2 = new StringBuffer("Java Programming");

        String result2 = sb2.substring(0, 4);

        System.out.println("substring(start, end): " + result2);


        // 48. indexOf()
        StringBuffer sb3 = new StringBuffer("Java Programming Java");

        int result3 = sb3.indexOf("Java");

        System.out.println("indexOf(): " + result3);


        // 49. lastIndexOf()
        StringBuffer sb4 = new StringBuffer("Java Programming Java");

        int result4 = sb4.lastIndexOf("Java");

        System.out.println("lastIndexOf(): " + result4);


        // 50. replace()
        StringBuffer sb5 = new StringBuffer("I love Java");

        sb5.replace(7, 11, "Python");

        System.out.println("replace(): " + sb5);
    }
}
