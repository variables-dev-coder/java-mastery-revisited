package day06_Exception_Basics_Hierarchy;

public class ErrorDemo {

    public static void main(String[] args) {
        int[] bigArray = new int[Integer.MAX_VALUE];
    }
}

//Interview Line
//Errors indicate JVM instability and should not be caught.