package revision_Arrays;

public class RemoveSpecificElement {

    static int removeElement(int[] arr, int val) {

        int write = 0;

        for (int read = 0; read < arr.length; read++) {

            // Keep elements that are not val
            if (arr[read] != val) {

                arr[write] = arr[read];
                write++;
            }
        }

        return write;
    }

    public static void main(String[] args) {

        int[] arr = {3, 2, 2, 3};
        int val = 3;

        int newLength = removeElement(arr, val);

        System.out.println("Remaining elements = " + newLength);

        System.out.print("Array = ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
