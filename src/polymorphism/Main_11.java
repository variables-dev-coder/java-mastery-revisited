package polymorphism;


class Customer {

    double calculateDiscount(double price) {
        return 0;
    }
}

class RegularCustomer extends Customer {

    @Override
    double calculateDiscount(double price) {
        return price * 0.05;
    }
}

class PremiumCustomer extends Customer {

    @Override
    double calculateDiscount(double price) {
        return price * 0.15;
    }
}

class VIPCustomer extends Customer {

    @Override
    double calculateDiscount(double price) {
        return price * 0.25;
    }
}

public class Main_11 {

    public static void main(String[] args) {

        Customer[] customers = {
                new RegularCustomer(),
                new PremiumCustomer(),
                new VIPCustomer()
        };

        double price = 10000;

        for (Customer customer : customers) {

            double discount =
                    customer.calculateDiscount(price);

            double finalPrice = price - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("----------------");
        }
    }
}

