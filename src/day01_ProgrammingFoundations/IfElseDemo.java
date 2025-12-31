package day01_ProgrammingFoundations;

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
