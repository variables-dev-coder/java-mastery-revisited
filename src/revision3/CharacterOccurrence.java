package revision3;

public class CharacterOccurrence {

    public static void main(String[] args) {

        String str = "programming";
        char target = 'g';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("String     : " + str);
        System.out.println("Character  : " + target);
        System.out.println("Occurrences: " + count);
    }
}
