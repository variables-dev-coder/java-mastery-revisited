package revision3;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Duplicate Characters:");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
    }
}
