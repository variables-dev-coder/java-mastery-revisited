package revision3;

import java.util.Scanner;

public class CharacterAtUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < str.length()) {
            System.out.println("Character: " + str.charAt(index));
        } else {
            System.out.println("Invalid Index");
        }

        sc.close();
    }
}
