package revision_Arrays;

import java.util.Arrays;

public class Example6 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        int[] b = Arrays.copyOf(a, a.length);

        b[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}
