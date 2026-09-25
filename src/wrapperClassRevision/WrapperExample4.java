package wrapperClassRevision;

public class WrapperExample4 {

    public static void main(String[] args) {

        String text = "Java 123 Code";

        int letters = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("Text: " + text);
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
