package revision_String;

public class StringBufferMethods36To40 {

    public static void main(String[] args) {

        // ========================================
        // 36. append()
        // ========================================

        StringBuffer sb1 = new StringBuffer("Java");

        sb1.append(" Programming");

        System.out.println("append(): " + sb1);


        // ========================================
        // 37. insert()
        // ========================================

        StringBuffer sb2 = new StringBuffer("Java");

        sb2.insert(4, " Programming");

        System.out.println("insert(): " + sb2);


        // ========================================
        // 38. delete()
        // ========================================

        StringBuffer sb3 = new StringBuffer("Java Programming");

        sb3.delete(4, 16);

        System.out.println("delete(): " + sb3);


        // ========================================
        // 39. deleteCharAt()
        // ========================================

        StringBuffer sb4 = new StringBuffer("Java");

        sb4.deleteCharAt(1);

        System.out.println("deleteCharAt(): " + sb4);


        // ========================================
        // 40. reverse()
        // ========================================

        StringBuffer sb5 = new StringBuffer("Java");

        sb5.reverse();

        System.out.println("reverse(): " + sb5);
    }
}
