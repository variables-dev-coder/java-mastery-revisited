package logic_Array.day17_Fixed_Sliding_Window;

import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        printFirstNegative(arr, k);
    }

    public static void printFirstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                q.add(i);
            }

            if (i >= k - 1) {

                if (!q.isEmpty() && q.peek() >= i - k + 1) {
                    System.out.print(arr[q.peek()] + " ");
                } else {
                    System.out.print("0 ");
                }

                if (!q.isEmpty() && q.peek() == i - k + 1) {
                    q.poll();
                }
            }
        }
    }
}
