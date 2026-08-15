package day32_Java_String_Methods;

/*
Example 3 — Cleaning and Splitting Data

Methods covered:

trim()
strip()
split()
String.join()
isEmpty()
isBlank()
repeat()
 */

public class CleaningSplittingData {

        public static void main(String[] args) {

            // 1. trim()
            String name = "   Munna   ";

            System.out.println(
                    "After trim: [" + name.trim() + "]"
            );

            // 2. strip()
            String city = "   Mumbai   ";

            System.out.println(
                    "After strip: [" + city.strip() + "]"
            );

            // 3. isEmpty()
            String empty = "";

            System.out.println(
                    "isEmpty(): " + empty.isEmpty()
            );

            // 4. isBlank()
            String spaces = "   ";

            System.out.println(
                    "isBlank(): " + spaces.isBlank()
            );

            // 5. split()
            String languages = "Java,Oracle,Python";

            String[] arr = languages.split(",");

            System.out.println("Languages:");

            for (String language : arr) {
                System.out.println(language);
            }

            // 6. String.join()
            String result = String.join(
                    " | ",
                    arr
            );

            System.out.println(
                    "Joined: " + result
            );

            // 7. repeat()
            String line = "-";

            System.out.println(
                    line.repeat(20)
            );
        }
    }

    /*

    Output
After trim: [Munna]
After strip: [Mumbai]
isEmpty(): true
isBlank(): true


Languages:
Java
Oracle
Python


Joined: Java | Oracle | Python
--------------------
Very important concept

trim() and strip():

"   Java   "


      ↓

"Java"

split():

"Java,Oracle,Python"


        ↓

["Java", "Oracle", "Python"]

join():

["Java", "Oracle", "Python"]


        ↓

"Java | Oracle | Python"
     */