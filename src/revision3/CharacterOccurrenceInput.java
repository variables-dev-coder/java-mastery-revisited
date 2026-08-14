package revision3;

import java.util.Scanner;

public class CharacterOccurrenceInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Character: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Character '" + target + "' occurs " + count + " times.");

        sc.close();
    }
}
