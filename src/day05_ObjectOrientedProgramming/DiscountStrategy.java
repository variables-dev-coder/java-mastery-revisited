package day05_ObjectOrientedProgramming;

interface DiscountStrategy {
    double applyDiscount(double amount);
}

class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount;
    }
}

class FestivalDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.8;
    }
}

class BillingService {
    private DiscountStrategy strategy;

    BillingService(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    double calculateBill(double amount) {
        return strategy.applyDiscount(amount);
    }

    public static void main(String[] args) {
        BillingService b1 = new BillingService(new NoDiscount());
        System.out.println(b1.calculateBill(1000));

        BillingService b2 = new BillingService(new FestivalDiscount());
        System.out.println(b2.calculateBill(1000));
    }
}

// 1000.0
// 800.0

// “This is Strategy Pattern using interface & polymorphism”