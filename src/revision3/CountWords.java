package revision3;

public class CountWords {
    public static void main(String[] args) {

        String sentence = "Java is a powerful programming language";

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
