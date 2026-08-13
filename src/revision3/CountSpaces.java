package revision3;

public class CountSpaces {

    public static void main(String[] args) {

        String str = "Java is a programming language";

        char target = ' ';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Spaces: " + count);
    }
}
