package day06_Exception_Basics_Hierarchy;

public class StackTraceDemo {

    public static void main(String[] args) {
        methodA();
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        String str = null;
        System.out.println(str.length());
    }
}

//Exception in thread "main" java.lang.NullPointerException
//    at StackTraceDemo.methodB(StackTraceDemo.java:14)
//    at StackTraceDemo.methodA(StackTraceDemo.java:9)
//    at StackTraceDemo.main(StackTraceDemo.java:5)

//How to Read It
//Top → where exception happened
//Bottom → entry point (main)
//Call flow shown clearly