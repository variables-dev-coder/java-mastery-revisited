package wrapperClassRevision;

import java.util.ArrayList;

public class WrapperExample12 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(34);
        numbers.add(67);

        int maximum = Integer.MIN_VALUE;

        for (Integer number : numbers) {

            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Maximum: " + maximum);
    }
}
