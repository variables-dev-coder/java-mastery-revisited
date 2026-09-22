package wrapperClassRevision;

import java.util.ArrayList;

public class WrapperCompleteDemo {

    public static void main(String[] args) {

        // 1. Primitive
        int number = 100;

        // 2. Autoboxing
        Integer wrapper = number;

        // 3. Auto-unboxing
        int value = wrapper;

        // 4. String to primitive
        String str = "500";
        int parsed = Integer.parseInt(str);

        // 5. String to wrapper
        Integer obj = Integer.valueOf(str);

        // 6. Character methods
        char ch = 'A';

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isUpperCase(ch));

        // 7. Integer constants
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // 8. Collection
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);

        // 9. Value comparison
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a.equals(b));

        // 10. Convert integer to String
        String result = Integer.toString(number);

        System.out.println(result);
    }
}
