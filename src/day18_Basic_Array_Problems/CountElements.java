package day18_Basic_Array_Problems;

public class CountElements {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("Total elements = " + count);
    }
}

// Total elements = 5