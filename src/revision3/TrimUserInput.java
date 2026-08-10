package revision3;

import java.util.Scanner;

public class TrimUserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        name = name.trim();

        System.out.println("Name: [" + name + "]");

        sc.close();
    }
}
