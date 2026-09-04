package revision_Arrays;

public class FindMissingNumber2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};

        int n = 5;

        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        for (int value : arr) {
            xor ^= value;
        }

        System.out.println("Missing number = " + xor);
    }
}
