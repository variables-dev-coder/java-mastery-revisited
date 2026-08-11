package revision3;

public class ReplaceVsReplaceAll {

    public static void main(String[] args) {

        String str = "abc123xyz456";

        String result1 = str.replace("123", "");

        String result2 = str.replaceAll("[0-9]", "");

        System.out.println("replace()    : " + result1);
        System.out.println("replaceAll() : " + result2);
    }
}
