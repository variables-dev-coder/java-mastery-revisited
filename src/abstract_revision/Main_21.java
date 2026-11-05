package abstract_revision;

interface Order {

    void placeOrder();

    void cancelOrder();
}

abstract class FoodOrder implements Order {

    protected String foodName;
    protected double price;

    FoodOrder(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    void displayOrder() {
        System.out.println("Food: " + foodName);
        System.out.println("Price: ₹" + price);
    }

    abstract double calculateDeliveryCharge();
}

class PizzaOrder extends FoodOrder {

    PizzaOrder(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public void placeOrder() {
        System.out.println("Pizza order placed");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Pizza order cancelled");
    }

    @Override
    double calculateDeliveryCharge() {
        return 40;
    }
}

class BurgerOrder extends FoodOrder {

    BurgerOrder(String foodName, double price) {
        super(foodName, price);
    }

    @Override
    public void placeOrder() {
        System.out.println("Burger order placed");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Burger order cancelled");
    }

    @Override
    double calculateDeliveryCharge() {
        return 25;
    }
}

public class Main_21 {

    public static void main(String[] args) {

        FoodOrder order = new PizzaOrder("Margherita", 250);

        order.displayOrder();
        order.placeOrder();

        System.out.println("Delivery: ₹" + order.calculateDeliveryCharge());

        order = new BurgerOrder("Cheese Burger", 150);

        order.displayOrder();
        order.placeOrder();

        System.out.println("Delivery: ₹" + order.calculateDeliveryCharge());
    }
}
