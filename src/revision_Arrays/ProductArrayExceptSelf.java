package revision_Arrays;

public class ProductArrayExceptSelf {

    static int[] productExceptSelf(int[] arr) {

        int n = arr.length;

        int[] answer = new int[n];

        // Step 1: Store left products
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {

            answer[i] = leftProduct;

            leftProduct *= arr[i];
        }

        // Step 2: Multiply by right products
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] *= rightProduct;

            rightProduct *= arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] result = productExceptSelf(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
