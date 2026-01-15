package revision;

class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();
    }
}

