package day20_Array_ArrayList;

import java.util.ArrayList;

public class ArrayListInsertDelete {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);   // insert at index
        list.remove(2);   // delete at index

        System.out.println("ArrayList after insert & delete:");
        System.out.println(list);
    }
}

//Clean API
//No manual shifting
//Better readability