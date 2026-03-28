package logic_Array.revision3;

public class ArrayFrequency {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};

        int[] freq = new int[10]; // assuming max = 9

        for(int num : arr){
            freq[num]++;
        }

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + " → " + freq[i]);
            }
        }
    }
}
