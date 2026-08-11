package revision3;

public class ReplaceImmutable {

    public static void main(String[] args) {

        String str = "banana";

        str.replace('a', 'o');

        System.out.println(str);
    }
}

// banana

// Why?

// Because:

//        str.replace('a', 'o');

// creates/returns a new String.

// It does not modify str.