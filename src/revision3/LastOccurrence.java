package revision3;

public class LastOccurrence {

    public static void main(String[] args) {

        String str = "programming";
        char target = 'g';

        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == target) {
                System.out.println("Last occurrence: " + i);
                break;
            }
        }
    }
}
