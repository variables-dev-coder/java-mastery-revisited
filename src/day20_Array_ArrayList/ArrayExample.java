package day20_Array_ArrayList;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // arr[5] = 60;  // Runtime error (fixed size)

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Fixed size
//Primitive support
//Fast access