package revision3;

public class ReplaceImmutableCorrect {

    public static void main(String[] args) {

        String str = "banana";

        str = str.replace('a', 'o');

        System.out.println(str);
    }
}
