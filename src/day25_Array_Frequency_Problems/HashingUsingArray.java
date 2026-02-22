package day25_Array_Frequency_Problems;

public class HashingUsingArray {
    public static void main(String[] args) {

        int[] arr = {5,3,5,2,1,3};

        int[] hash = new int[6]; // max value 5

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        System.out.println("Frequency of 5: " + hash[5]);
        System.out.println("Frequency of 3: " + hash[3]);
    }
}