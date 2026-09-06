package revision_Arrays;

public class FindingElementAppearsOnce {

    static int singleNumber(int[] arr) {

        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};

        int answer = singleNumber(arr);

        System.out.println("Single element = " + answer);
    }
}
