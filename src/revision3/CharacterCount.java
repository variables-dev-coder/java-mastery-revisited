package revision3;

public class CharacterCount {
    public static void main(String[] args) {

        String str = "Java123@GPT";

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch))
                lower++;
            else if (Character.isDigit(ch))
                digit++;
            else
                special++;
        }

        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase : " + lower);
        System.out.println("Digits    : " + digit);
        System.out.println("Special   : " + special);
    }
}
