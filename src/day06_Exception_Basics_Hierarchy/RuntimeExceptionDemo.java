package day06_Exception_Basics_Hierarchy;

public class RuntimeExceptionDemo {

    public static void main(String[] args) {
        String value = null;
        value.toUpperCase(); // no compiler error
    }
}

//Compiler allows this → runtime failure only.