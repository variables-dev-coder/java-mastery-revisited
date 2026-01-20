package exceptionRevision;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("Null issue");
        } catch (Exception e) {
            System.out.println("Generic issue");
        }
    }
}

//Correct order
//Parent first = compile error