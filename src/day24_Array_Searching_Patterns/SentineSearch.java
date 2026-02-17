package day24_Array_Searching_Patterns;

public class SentineSearch {

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;

        int n = arr.length;
        int last = arr[n - 1];

        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;

        if (i < n - 1 || last == key)
            System.out.println("Found at index " + i);
        else
            System.out.println("Not Found");
    }
}
