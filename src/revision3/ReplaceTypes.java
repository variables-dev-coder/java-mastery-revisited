package revision3;

public class ReplaceTypes {

    public static void main(String[] args) {

        String str = "banana";

        // char → char
        String result1 = str.replace('a', 'o');

        // String → String
        String result2 = str.replace("banana", "apple");

        System.out.println(result1);
        System.out.println(result2);
    }
}
