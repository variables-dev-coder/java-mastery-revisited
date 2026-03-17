package logic_Array.revision;

public class LinearSearchExample {

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        int target = 4;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
