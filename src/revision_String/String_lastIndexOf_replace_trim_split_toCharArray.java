package revision_String;

public class String_lastIndexOf_replace_trim_split_toCharArray {

    public static void main(String[] args) {

        String s = "   banana programming banana   ";

        // 1. trim()
        s = s.trim();

        System.out.println("After trim: " + s);

        // 2. lastIndexOf()
        int index = s.lastIndexOf('a');

        System.out.println("Last 'a' index: " + index);

        // 3. replace()
        s = s.replace("banana", "apple");

        System.out.println("After replace: " + s);

        // 4. split()
        String[] words = s.split(" ");

        System.out.println("Words:");

        for (String word : words) {
            System.out.println(word);
        }

        // 5. toCharArray()
        char[] chars = s.toCharArray();

        System.out.println("First character: " + chars[0]);
    }
}
