package day21_Array_revision;

public class LinearSearchExample {
    
    public static void main(String[] args) {

        int[] arr = {5, 8, 12, 3, 9};
        int key = 12;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Element found" : "Element not found");
    }
}
