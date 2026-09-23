package wrapperClassRevision;

import java.util.ArrayList;

public class WrapperExample2 {

    public static void main(String[] args) {

        // Marks received as String
        String marks1 = "85";
        String marks2 = "90";
        String marks3 = "75";

        // String -> int
        int m1 = Integer.parseInt(marks1);
        int m2 = Integer.parseInt(marks2);
        int m3 = Integer.parseInt(marks3);

        // int -> Integer (Autoboxing)
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(m1);
        marks.add(m2);
        marks.add(m3);

        // Integer -> int (Auto-unboxing)
        int total = marks.get(0) + marks.get(1) + marks.get(2);

        double average = total / 3.0;

        System.out.println("Marks: " + marks);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
