package wrapperClassRevision;

public class WrapperExample9 {

    public static void main(String[] args) {

        // Prices received as Strings
        String price1 = "199.50";
        String price2 = "349.75";
        String price3 = "125.25";

        // String -> double
        double p1 = Double.parseDouble(price1);
        double p2 = Double.parseDouble(price2);
        double p3 = Double.parseDouble(price3);

        // Calculate total
        double total = p1 + p2 + p3;

        // double -> Double (autoboxing)
        Double totalObject = total;

        // Double -> double (unboxing)
        double finalPrice = totalObject;

        System.out.println("Product 1: ₹" + p1);
        System.out.println("Product 2: ₹" + p2);
        System.out.println("Product 3: ₹" + p3);

        System.out.println("Total: ₹" + finalPrice);

        // Using Double method
        System.out.println("Is total finite? "
                + Double.isFinite(finalPrice));
    }
}
