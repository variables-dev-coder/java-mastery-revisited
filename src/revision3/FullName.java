package revision3;

import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");

        String first = sc.nextLine();

        System.out.print("Enter Last Name: ");

        String last = sc.nextLine();

        String fullName = first + " " + last;

        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}
