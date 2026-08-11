package revision3;

public class RemoveLetters {

    public static void main(String[] args) {

        String str = "Java123@456";

        String result = str.replaceAll("[a-zA-Z]", "");

        System.out.println(result);
    }
}
