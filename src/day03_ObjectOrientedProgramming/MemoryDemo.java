package day03_ObjectOrientedProgramming;

public class MemoryDemo {
    int x = 10;

    public static void main(String[] args) {
        MemoryDemo obj = new MemoryDemo();
        System.out.println(obj.x);
    }
}


// 10
//JVM Flow
//obj → stack
//object → heap
//class info → metaspace

