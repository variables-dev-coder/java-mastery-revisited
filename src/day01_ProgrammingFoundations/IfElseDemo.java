package day01_ProgrammingFoundations;

/*
int x = 10;

if (x = 5) {   // valid or invalid?
    System.out.println("Yes");
}

 */

public class IfElseDemo {
    public static void main(String[] args) {
        int marks = 65;

        if (marks >= 75) {
            System.out.println("Distinction");
        } else if (marks >= 60) {
            System.out.println("First Class"); // Fast Class
        } else if (marks >= 40) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }
    }
}
