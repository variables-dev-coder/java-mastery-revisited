package revision3;

public class CharacterPositions {

    public static void main(String[] args) {

        String str = "programming";
        char target = 'g';

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
