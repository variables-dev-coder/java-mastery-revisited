package day06_Exception_Basics_Hierarchy;

/*
ArrayIndexOutOfBoundsException – Memory Safety
Concept
Occurs when accessing an invalid array index.

 */

public class ArrayIndexDemo {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};
        System.out.println(nums[10]);  // invalid
    }
}

/*
Why JVM Throws This?
Prevents illegal memory access
Ensures memory safety
Java does runtime bounds checking

Interview Line
Java checks array bounds at runtime to avoid memory corruption.
 */