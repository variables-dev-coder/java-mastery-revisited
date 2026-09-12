package revision_String;

public class String_Methods {

    public static void main(String[] args) {

        String s = "JavaProgramming";

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. charAt()
        System.out.println("First character: " + s.charAt(0));

        // 3. substring()
        System.out.println("First 4 characters: " + s.substring(0, 4));

        // 4. equals()
        System.out.println(
                "Is equal to JavaProgramming? "
                        + s.equals("JavaProgramming")
        );

        // 5. contains()
        System.out.println(
                "Contains Programming? "
                        + s.contains("Programming")
        );

        // 6. indexOf()
        System.out.println(
                "Programming starts at index: "
                        + s.indexOf("Programming")
        );
    }
}

/*

1. How many characters?
        ↓
    length()

2. Give me first character
        ↓
    charAt(0)

3. Give me "Java"
        ↓
    substring(0, 4)

4. Is the complete String "JavaProgramming"?
        ↓
    equals()

5. Does it contain "Programming"?
        ↓
    contains()

6. Where does "Programming" start?
        ↓
    indexOf()

    
 */