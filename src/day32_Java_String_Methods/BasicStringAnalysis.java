package day32_Java_String_Methods;

/*

Example 1 — Basic String Analysis

Methods covered:

length()
charAt()
substring()
indexOf()
lastIndexOf()
contains()
startsWith()
endsWith()

 */

public class BasicStringAnalysis {

    public static void main(String[] args) {

        String email = "munna@gmail.com";

        // 1. length()
        System.out.println("Length: " + email.length());

        // 2. charAt()
        System.out.println("First character: " + email.charAt(0));

        // 3. indexOf()
        int atPosition = email.indexOf('@');
        System.out.println("@ position: " + atPosition);

        // 4. lastIndexOf()
        int lastA = email.lastIndexOf('a');
        System.out.println("Last 'a' position: " + lastA);

        // 5. substring()
        String username = email.substring(0, atPosition);
        System.out.println("Username: " + username);

        // 6. contains()
        System.out.println("Contains gmail: "
                + email.contains("gmail"));

        // 7. startsWith()
        System.out.println("Starts with munna: "
                + email.startsWith("munna"));

        // 8. endsWith()
        System.out.println("Ends with .com: "
                + email.endsWith(".com"));
    }
}

/*
Output
Length: 15
First character: m
@ position: 5
Last 'a' position: 3
Username: munna
Contains gmail: true
Starts with munna: true
Ends with .com: true
What happened?

The important pattern here is:

Find position
     ↓
indexOf()
     ↓
Use substring()
     ↓
Extract required data

This pattern appears very frequently in real applications and coding problems.
 */