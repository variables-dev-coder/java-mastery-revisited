package revision3;

public class RemoveDigits {

    public static void main(String[] args) {

        String str = "Java123Programming456";

        String result = str.replaceAll("[0-9]", "");

        System.out.println("Original : " + str);
        System.out.println("Result   : " + result);
    }
}
