package day32_Java_String_Methods;


/*
Example 5 — Real-World Student Data Processing

Now let's combine almost everything into one practical program.

Suppose we receive this data:

"  munna mondal,25,Mumbai,Java|Oracle|Spring Boot  "

We want to:

Remove unnecessary spaces
Split the data
Extract name
Extract age
Extract city
Extract skills
Convert name to uppercase
Check city
Check age
Join skills
Count characters
Print characters

 */


public class Main {

    public static void main(String[] args) {

        String data =
                "  munna mondal,25,Mumbai,Java|Oracle|Spring Boot  ";

        // 1. strip()
        data = data.strip();

        System.out.println("Clean Data:");
        System.out.println(data);

        // 2. split()
        String[] parts = data.split(",");

        // Extract information
        String name = parts[0];
        String age = parts[1];
        String city = parts[2];
        String skillsData = parts[3];

        // 3. toUpperCase()
        String upperName = name.toUpperCase();

        System.out.println("\nName: " + upperName);

        // 4. String.valueOf() concept
        int ageNumber = Integer.parseInt(age);

        String ageString = String.valueOf(ageNumber);

        System.out.println("Age: " + ageString);

        // 5. equals()
        if (city.equals("Mumbai")) {
            System.out.println("City: Mumbai");
        }

        // 6. equalsIgnoreCase()
        if (city.equalsIgnoreCase("mumbai")) {
            System.out.println(
                    "City comparison ignoring case: true"
            );
        }

        // 7. contains()
        System.out.println(
                "Has Java skill: "
                        + skillsData.contains("Java")
        );

        // 8. startsWith()
        System.out.println(
                "Name starts with Munna: "
                        + name.startsWith("munna")
        );

        // 9. endsWith()
        System.out.println(
                "Skill data ends with Boot: "
                        + skillsData.endsWith("Boot")
        );

        // 10. split() again
        String[] skills = skillsData.split("\\|");

        System.out.println("\nSkills:");

        for (String skill : skills) {
            System.out.println(skill);
        }

        // 11. String.join()
        String skillResult = String.join(
                ", ",
                skills
        );

        System.out.println(
                "\nSkills: " + skillResult
        );

        // 12. length()
        System.out.println(
                "\nName length: " + name.length()
        );

        // 13. charAt()
        System.out.println(
                "First character: " + name.charAt(0)
        );

        // 14. indexOf()
        int spacePosition = name.indexOf(' ');

        System.out.println(
                "Space position: " + spacePosition
        );

        // 15. substring()
        String firstName =
                name.substring(0, spacePosition);

        System.out.println(
                "First name: " + firstName
        );

        // 16. lastIndexOf()
        int lastSpace =
                name.lastIndexOf(' ');

        String lastName =
                name.substring(lastSpace + 1);

        System.out.println(
                "Last name: " + lastName
        );

        // 17. replace()
        String modifiedName =
                name.replace(" ", "_");

        System.out.println(
                "Modified name: " + modifiedName
        );

        // 18. replaceAll()
        String onlyLetters =
                name.replaceAll("[^a-zA-Z ]", "");

        System.out.println(
                "Only letters: " + onlyLetters
        );

        // 19. toLowerCase()
        System.out.println(
                "Lowercase: " + name.toLowerCase()
        );

        // 20. trim()
        String test =
                "   Java Programming   ";

        System.out.println(
                "Trimmed: [" + test.trim() + "]"
        );

        // 21. isEmpty()
        String empty = "";

        System.out.println(
                "Is empty: " + empty.isEmpty()
        );

        // 22. isBlank()
        String blank = "   ";

        System.out.println(
                "Is blank: " + blank.isBlank()
        );

        // 23. repeat()
        System.out.println(
                "=".repeat(30)
        );

        // 24. matches()
        System.out.println(
                "Age contains only digits: "
                        + age.matches("[0-9]+")
        );

        // 25. compareTo()
        System.out.println(
                "Name comparison with Aziz: "
                        + name.compareTo("Aziz")
        );

        // 26. toCharArray()
        char[] chars = name.toCharArray();

        System.out.println("\nCharacters:");

        for (char c : chars) {
            System.out.println(c);
        }
    }
}

/*

What This Program Teaches

This one program uses the major methods from Chapter 4:

length()
        ↓
Count characters


charAt()
        ↓
Get character


substring()
        ↓
Extract text


equals()
        ↓
Compare content


equalsIgnoreCase()
        ↓
Case-insensitive comparison


compareTo()
        ↓
Lexicographical comparison


contains()
        ↓
Search text


indexOf()
        ↓
Find first position


lastIndexOf()
        ↓
Find last position


startsWith()
        ↓
Check beginning


endsWith()
        ↓
Check ending


toUpperCase()
        ↓
Uppercase


toLowerCase()
        ↓
Lowercase


trim()
        ↓
Remove basic leading/trailing whitespace


strip()
        ↓
Remove Unicode-aware leading/trailing whitespace


replace()
        ↓
Literal replacement


replaceAll()
        ↓
Regex replacement


split()
        ↓
String → String[]


join()
        ↓
Multiple Strings → one String


isEmpty()
        ↓
Check length == 0


isBlank()
        ↓
Check empty/whitespace


repeat()
        ↓
Repeat String


matches()
        ↓
Regex validation


toCharArray()
        ↓
String → char[]


String.valueOf()
        ↓
Value → String


getBytes()
        ↓
String → byte[]
 */