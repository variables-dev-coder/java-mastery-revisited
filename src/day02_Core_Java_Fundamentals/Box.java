package day02_Core_Java_Fundamentals;


public class Box {
    int value;
}

class Test {

    static void change(Box b) {
        b.value = 50;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.value = 10;
        change(box);
        System.out.println(box.value); // 50
    }
}


//Why?
//Reference value is copied
//Both references point to same object in heap