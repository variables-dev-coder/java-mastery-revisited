package day01_ProgrammingFoundations;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age : ");
        int age = sc.nextInt();

        sc.nextLine();  // continue new line

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("name : " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
