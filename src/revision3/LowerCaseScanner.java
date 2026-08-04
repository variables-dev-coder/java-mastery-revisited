package revision3;

import java.util.Scanner;

public class LowerCaseScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");

        String str = sc.nextLine();

        System.out.println("Lowercase: " + str.toLowerCase());

        sc.close();
    }
}
