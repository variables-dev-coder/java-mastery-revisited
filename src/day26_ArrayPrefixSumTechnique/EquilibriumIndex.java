package day26_ArrayPrefixSumTechnique;

public class EquilibriumIndex {
    public static void main(String[] args) {

        int[] arr = {1,3,5,2,2};

        int total = 0;

        for(int num : arr)
            total += num;

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){

            total -= arr[i];

            if(leftSum == total)
                System.out.println("Equilibrium index: " + i);

            leftSum += arr[i];
        }
    }
}
