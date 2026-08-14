package revision3;

public class FirstOccurrence {

    public static void main(String[] args) {

        String str = "programming";
        char target = 'g';

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                System.out.println("First occurrence: " + i);
                break;
            }
        }
    }
}
