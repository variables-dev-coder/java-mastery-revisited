package day02_Core_Java_Fundamentals;

public class MemoryDemo {

    static void change(int x) {
        x = 60;
    }

    public static void main(String[] args) {
        int a = 30;
        change(a);
        System.out.println(a);  // 30
    }
}

/*
Step 1: JVM Starts Program
    JVM loads MemoryDemo
    Looks for public static void main
    Execution starts from main()

Step 2: main() Stack Frame Created
Stack now has:

main()
  a = 30

a is a local variable in main’s stack frame

Step 3: change(a) is Called
Value of a (which is 30) is COPIED

New stack frame created for change()

change()
  x = 30   ← copy of a

Important Rule

Java is PASS BY VALUE
Even for primitives and object references.

Step 4: Inside change()
x = 50;

modify only x

x is a local variable

It lives inside change() stack frame

change()
  x = 60

a is NOT touched

Step 5: change() Ends

Stack frame of change() is destroyed

Control returns to main()

main()
  a = 30   ← unchanged

Step 6: Print a

System.out.println(a);


Output: 60


 */