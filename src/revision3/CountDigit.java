package revision3;

public class CountDigit {

    public static void main(String[] args) {

        String str = "123451236";
        char target = '2';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Digit " + target + " appears " + count + " times.");
    }
}
