package revision3;

public class CharacterOccurrenceArray {

    public static void main(String[] args) {

        String str = "programming";
        char target = 'g';

        int count = 0;

        for (char ch : str.toCharArray()) {

            if (ch == target) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}
