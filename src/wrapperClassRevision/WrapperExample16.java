package wrapperClassRevision;

public class WrapperExample16 {

    public static void main(String[] args) {

        double price = 100.0;
        double quantity = 5.0;

        double total = price * quantity;

        Double totalObject = total; // Autoboxing

        System.out.println("Total: " + totalObject);

        // Check whether the value is finite
        if (Double.isFinite(totalObject)) {
            System.out.println("Total is a valid finite number.");
        }

        // Infinity
        double infinity = 10.0 / 0.0;

        System.out.println("Infinity: " + infinity);
        System.out.println(
                "Is infinity finite? " + Double.isFinite(infinity)
        );

        // NaN
        double notANumber = 0.0 / 0.0;

        System.out.println("NaN: " + notANumber);
        System.out.println(
                "Is NaN finite? " + Double.isFinite(notANumber)
        );
    }
}
