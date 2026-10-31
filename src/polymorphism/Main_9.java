package polymorphism;


class Food {

    void prepare() {
        System.out.println("Preparing food...");
    }
}

class Pizza extends Food {

    @Override
    void prepare() {
        System.out.println("Preparing pizza with cheese");
    }
}

class Burger extends Food {

    @Override
    void prepare() {
        System.out.println("Preparing burger with vegetables");
    }
}

class Biryani extends Food {

    @Override
    void prepare() {
        System.out.println("Preparing biryani with spices");
    }
}

public class Main_9 {

    public static void main(String[] args) {

        Food[] foods = {
                new Pizza(),
                new Burger(),
                new Biryani()
        };

        for (Food food : foods) {
            food.prepare();
        }
    }
}

