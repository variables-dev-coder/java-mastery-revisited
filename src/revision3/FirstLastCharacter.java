package revision3;

public class FirstLastCharacter {

    public static void main(String[] args) {

        String str = "Programming";

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        System.out.println("First Character: " + first);
        System.out.println("Last Character : " + last);
    }
}
