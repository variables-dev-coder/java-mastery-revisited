package revision_String;

import java.util.Scanner;

public class String_Equals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("String: ");

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Same");
        } else {
            System.out.println("Diffrent");
        }
    }
}
