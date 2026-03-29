package logic_Array.revision3;

public class ThirdLargest {

    public static int thirdLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int result = thirdLargest(arr);
        System.out.println("Third Largest: " + result);
    }
}
