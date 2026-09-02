package revision_Arrays;

public class FrequencyCounting {

    static void countFrequency(int[] arr) {

        int[] frequency = new int[10];

        for (int value : arr) {
            frequency[value]++;
        }

        System.out.println("Frequency:");

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > 0) {

                System.out.println(
                        i + " appears " + frequency[i] + " time(s)"
                );
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {
                1, 2, 3, 2, 1, 4, 2, 5, 1
        };

        countFrequency(numbers);
    }
}
