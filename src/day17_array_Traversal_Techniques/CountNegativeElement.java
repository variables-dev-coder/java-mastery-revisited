package day17_array_Traversal_Techniques;

public class CountNegativeElement {
    public static void main(String[] args) {

        int[] arr = {-101, 22, -45, 56, -100};

        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            }
        }
        System.out.println(negative);
    }
}
