package revision_String;

import java.util.Scanner;

public class StringLengthcharAt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me String: ");

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
