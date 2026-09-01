package revision_Arrays;

import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
