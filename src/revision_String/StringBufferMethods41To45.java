package revision_String;

public class StringBufferMethods41To45 {

    public static void main(String[] args) {

        // 41. setCharAt()
        StringBuffer sb1 = new StringBuffer("Java");

        sb1.setCharAt(0, 'K');

        System.out.println("setCharAt(): " + sb1);


        // 42. length()
        StringBuffer sb2 = new StringBuffer("Java Programming");

        System.out.println("length(): " + sb2.length());


        // 43. capacity()
        StringBuffer sb3 = new StringBuffer();

        System.out.println("capacity(): " + sb3.capacity());


        // 44. ensureCapacity()
        StringBuffer sb4 = new StringBuffer();

        System.out.println("Before ensureCapacity(): " + sb4.capacity());

        sb4.ensureCapacity(100);

        System.out.println("After ensureCapacity(): " + sb4.capacity());


        // 45. toString()
        StringBuffer sb5 = new StringBuffer("Java");

        String result = sb5.toString();

        System.out.println("toString(): " + result);
    }
}
