package logic_Array.revision3;

import java.util.PriorityQueue;

public class KthLargest {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = findKthLargest(arr, k);
        System.out.println("Kth Largest: " + result);
    }
}
