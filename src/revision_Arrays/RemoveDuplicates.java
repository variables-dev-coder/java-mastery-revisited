package revision_Arrays;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int write = 1;

        for (int read = 1; read < arr.length; read++) {

            // Found a new unique value
            if (arr[read] != arr[read - 1]) {

                arr[write] = arr[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int uniqueCount = removeDuplicates(arr);

        System.out.println("Unique elements = " + uniqueCount);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
