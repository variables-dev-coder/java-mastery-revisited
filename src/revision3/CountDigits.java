package revision3;

public class CountDigits {

    public static void main(String[] args) {

        String str = "Java123Programming45";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                count++;
            }
        }

        System.out.println("Digits: " + count);
    }
}
