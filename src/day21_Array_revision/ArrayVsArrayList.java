package day21_Array_revision;


import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // Array
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(arr[1]);
        System.out.println(list.get(1));
    }
}

