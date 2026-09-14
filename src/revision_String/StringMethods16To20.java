package revision_String;

public class StringMethods16To20 {

    public static void main(String[] args) {

        // --------------------------------
        // 16. isEmpty()
        // --------------------------------

        String s1 = "";

        System.out.println("Is s1 empty? " + s1.isEmpty());


        // --------------------------------
        // 17. isBlank()
        // --------------------------------

        String s2 = "   ";

        System.out.println("Is s2 blank? " + s2.isBlank());


        // --------------------------------
        // 18. concat()
        // --------------------------------

        String first = "Hello";
        String second = " Java";

        String result = first.concat(second);

        System.out.println("After concat: " + result);


        // --------------------------------
        // 19. repeat()
        // --------------------------------

        String symbol = "*";

        System.out.println("Repeated: " + symbol.repeat(5));


        // --------------------------------
        // 20. compareTo()
        // --------------------------------

        String word1 = "apple";
        String word2 = "banana";

        int comparison = word1.compareTo(word2);

        System.out.println("compareTo result: " + comparison);

        if (comparison < 0) {
            System.out.println(word1 + " comes before " + word2);
        } else if (comparison > 0) {
            System.out.println(word1 + " comes after " + word2);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
