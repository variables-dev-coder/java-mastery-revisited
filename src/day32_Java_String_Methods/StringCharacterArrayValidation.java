package day32_Java_String_Methods;

/*
Example 4 — String to Character Array and Validation

Methods covered:

toCharArray()
matches()
String.valueOf()
getBytes()
length()
charAt()
 */

import java.nio.charset.StandardCharsets;

public class StringCharacterArrayValidation {

        public static void main(String[] args) {

            String number = "12345";

            // 1. matches()
            boolean isNumber = number.matches("[0-9]+");

            System.out.println(
                    "Is number: " + isNumber
            );

            // 2. toCharArray()
            char[] chars = number.toCharArray();

            System.out.println("Characters:");

            for (char c : chars) {
                System.out.println(c);
            }

            // 3. String.valueOf()
            int age = 25;

            String ageString = String.valueOf(age);

            System.out.println(
                    "Age as String: " + ageString
            );

            // 4. getBytes()
            byte[] bytes = number.getBytes(
                    StandardCharsets.UTF_8
            );

            System.out.println("Bytes:");

            for (byte b : bytes) {
                System.out.println(b);
            }

            // 5. length()
            System.out.println(
                    "Length: " + number.length()
            );

            // 6. charAt()
            System.out.println(
                    "First character: " + number.charAt(0)
            );
        }
}

/*

Output
Is number: true


Characters:
1
2
3
4
5


Age as String: 25


Bytes:
49
50
51
52
53


Length: 5
First character: 1
Why are these methods useful?

matches():

Validate data

toCharArray():

String
  ↓
char[]

String.valueOf():

int
 ↓
String

getBytes():

String
  ↓
byte[]
 */