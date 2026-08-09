package revision3;

public class CountLetters {

    public static void main(String[] args) {

        String str = "Java123@Programming";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                count++;
            }
        }

        System.out.println("Letters: " + count);
    }
}
