package day24_Array_Searching_Patterns;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 25, 30, 40, 50};
        int key = 30;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
