package revision3;

public class SafeCharacterAccess {

    public static void main(String[] args) {

        String str = "Hello";

        int index = 5;

        if (index >= 0 && index < str.length()) {
            System.out.println(str.charAt(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}
