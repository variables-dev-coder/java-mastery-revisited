package revision3;

public class CharacterCounter {

    public static void main(String[] args) {

        String str = "Java123@#";

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                special++;
            }
        }

        System.out.println("Letters : " + letters);
        System.out.println("Digits  : " + digits);
        System.out.println("Special : " + special);
    }
}
