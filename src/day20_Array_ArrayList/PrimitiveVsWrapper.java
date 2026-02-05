package day20_Array_ArrayList;

import java.util.ArrayList;

public class PrimitiveVsWrapper {
    public static void main(String[] args) {

        int[] arr = new int[2];
        arr[0] = 10;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // autoboxing

        System.out.println(arr[0]);
        System.out.println(list.get(0));
    }
}

