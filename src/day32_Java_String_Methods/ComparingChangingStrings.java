package day32_Java_String_Methods;

/*
Example 2 — Comparing and Changing Strings

Methods covered:

equals()
equalsIgnoreCase()
compareTo()
toUpperCase()
toLowerCase()
replace()
replaceAll()
 */

public class ComparingChangingStrings {

    public static void main(String[] args) {

        String username = "Munna";
        String input = "munna";

        // 1. equals()
        System.out.println(
                "equals(): " + username.equals(input)
        );

        // 2. equalsIgnoreCase()
        System.out.println(
                "equalsIgnoreCase(): "
                        + username.equalsIgnoreCase(input)
        );

        // 3. compareTo()
        String a = "Apple";
        String b = "Banana";

        int result = a.compareTo(b);

        if (result < 0) {
            System.out.println("Apple comes before Banana");
        } else if (result > 0) {
            System.out.println("Apple comes after Banana");
        } else {
            System.out.println("Both are equal");
        }

        // 4. toUpperCase()
        String upper = username.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // 5. toLowerCase()
        String lower = username.toLowerCase();
        System.out.println("Lowercase: " + lower);

        // 6. replace()
        String message = "I love Java";

        String replaced = message.replace(
                "Java",
                "Spring Boot"
        );

        System.out.println("replace(): " + replaced);

        // 7. replaceAll()
        String data = "Java123Spring456";

        String onlyText = data.replaceAll(
                "[0-9]",
                ""
        );

        System.out.println("replaceAll(): " + onlyText);

    }
}

/*
Output
equals(): false
equalsIgnoreCase(): true
Apple comes before Banana
Uppercase: MUNNA
Lowercase: munna
replace(): I love Spring Boot
replaceAll(): JavaSpring
Important difference
equals()
     ↓
Case-sensitive


equalsIgnoreCase()
     ↓
Ignores case


replace()
     ↓
Literal replacement


replaceAll()
     ↓
Regular expression
 */