package revision_String;

public class StringBuilderMethods31To35 {

    public static void main(String[] args) {

        // ========================================
        // 31. reverse()
        // ========================================

        StringBuilder sb1 = new StringBuilder("Java");

        sb1.reverse();

        System.out.println("reverse(): " + sb1);


        // ========================================
        // 32. length()
        // ========================================

        StringBuilder sb2 = new StringBuilder("Java Programming");

        System.out.println("length(): " + sb2.length());


        // ========================================
        // 33. capacity()
        // ========================================

        StringBuilder sb3 = new StringBuilder();

        System.out.println("Initial capacity(): " + sb3.capacity());

        sb3.append("Java");

        System.out.println("Capacity after append(): " + sb3.capacity());


        // ========================================
        // 34. ensureCapacity()
        // ========================================

        StringBuilder sb4 = new StringBuilder();

        System.out.println("Before ensureCapacity(): "
                + sb4.capacity());

        sb4.ensureCapacity(100);

        System.out.println("After ensureCapacity(): "
                + sb4.capacity());


        // ========================================
        // 35. toString()
        // ========================================

        StringBuilder sb5 = new StringBuilder("Java");

        String result = sb5.toString();

        System.out.println("toString(): " + result);

        System.out.println("Result type: "
                + result.getClass().getSimpleName());
    }
}
