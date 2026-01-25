package day16_Array_Memory_Internals;

public class PassArrayModify {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        modify(arr);

        System.out.println(arr[0]); // 99
    }

    static void modify(int[] a) {
        a[0] = 99;
    }
}

