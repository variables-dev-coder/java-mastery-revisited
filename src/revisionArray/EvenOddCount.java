package revisionArray;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even=" + even + " Odd=" + odd);
    }
}

