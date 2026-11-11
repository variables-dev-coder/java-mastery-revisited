package SOLID_Principles_Intro_level;

// Open/Closed Principle (OCP)

// Example 3: Discount Management


interface Discount {
    double calculate(double price);
}

class FestivalDiscount implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.20;
    }
}

class StudentDiscount implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.10;
    }
}

class PremiumDiscount implements Discount {

    @Override
    public double calculate(double price) {
        return price * 0.30;
    }
}

class ShoppingService {

    public void applyDiscount(Discount discount, double price) {

        double discountAmount = discount.calculate(price);

        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Price: " + (price - discountAmount));
    }
}

public class Main_6 {
    public static void main(String[] args) {

        ShoppingService service = new ShoppingService();

        service.applyDiscount(new FestivalDiscount(), 5000);
        service.applyDiscount(new StudentDiscount(), 5000);
        service.applyDiscount(new PremiumDiscount(), 5000);
    }
}
