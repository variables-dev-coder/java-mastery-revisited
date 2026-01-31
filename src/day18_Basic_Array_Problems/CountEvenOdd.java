package day18_Basic_Array_Problems;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
}


//Even count = 3
//Odd count = 3