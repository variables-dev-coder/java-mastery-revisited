package day16_Array_Memory_Internals;

public class ReassignArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        change(arr);

        System.out.println(arr[0]); // 1
    }

    static void change(int[] a) {
        a = new int[]{7, 8, 9};
    }
}

