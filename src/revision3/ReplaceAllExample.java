package revision3;

public class ReplaceAllExample {

    public static void main(String[] args) {

        String str = "Java123Programming456";

        String result = str.replaceAll("[0-9]", "");

        System.out.println(result);
    }
}
