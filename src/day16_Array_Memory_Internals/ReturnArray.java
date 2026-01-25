package day16_Array_Memory_Internals;

public class ReturnArray {
    public static void main(String[] args) {

        int[] result = createArray();
        System.out.println(result[1]); // 20
    }

    static int[] createArray() {
        return new int[]{10, 20, 30};
    }
}

