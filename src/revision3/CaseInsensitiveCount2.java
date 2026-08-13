package revision3;

public class CaseInsensitiveCount2 {

    public static void main(String[] args) {

        String str = "Java JAVA java";
        char target = 'a';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == Character.toLowerCase(target)) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
