package revision_String;

import java.util.Scanner;

public class String_toUpperCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");

        String s = sc.nextLine();

        s = s.toUpperCase();

        System.out.println(s);
    }
}
