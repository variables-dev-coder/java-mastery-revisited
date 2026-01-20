package day14_Exception_Handling;

public class BlindCatchBad {

    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }
}

