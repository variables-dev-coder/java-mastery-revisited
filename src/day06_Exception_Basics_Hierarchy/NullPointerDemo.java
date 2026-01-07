package day06_Exception_Basics_Hierarchy;


/*
1. NullPointerException – RuntimeException

Concept

Occurs when JVM tries to access an object reference that is null.

 */

public class NullPointerDemo {

    public static void main(String[] args) {
        String name = null;   // reference exists, object does not
        System.out.println(name.length()); // JVM crash
    }
}

/*
What JVM Does
Detects access on null
Creates NullPointerException
Prints stack trace
Terminates main thread

Interview Line
NullPointerException is unchecked and indicates a programming bug.

 */