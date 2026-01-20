package day14_Exception_Handling;

public class SpecificCatchGood {

    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.err.println("Null value encountered");
        }
    }
}

