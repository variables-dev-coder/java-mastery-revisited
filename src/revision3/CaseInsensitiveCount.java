package revision3;

public class CaseInsensitiveCount {

    public static void main(String[] args) {

        String str = "Java JAVA java";
        char target = 'a';

        str = str.toLowerCase();
        target = Character.toLowerCase(target);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
