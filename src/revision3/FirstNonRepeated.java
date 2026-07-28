package revision3;

public class FirstNonRepeated {
    public static void main(String[] args) {

        String str = "swiss";

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First Non-Repeated Character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No Unique Character");
    }
}
