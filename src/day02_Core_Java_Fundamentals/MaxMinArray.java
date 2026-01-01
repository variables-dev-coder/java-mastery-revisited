package day02_Core_Java_Fundamentals;

public class MaxMinArray {

    public static void main(String[] args) {

        int[] arr = {12, 45, 2, 89, 34};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

//Max: 89
//Min: 2