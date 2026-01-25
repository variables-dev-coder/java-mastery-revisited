package day16_Array_Memory_Internals;

public class ArrayReference {
    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        int[] b = a;

        b[1] = 99;

        System.out.println(a[1]); // 99
    }
}

