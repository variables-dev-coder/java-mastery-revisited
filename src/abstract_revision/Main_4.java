package abstract_revision;

// Constructors in Abstract Classes

abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    abstract void start();
}

class Car extends Vehicle {

    Car() {
        System.out.println("Car constructor");
    }

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class Main_4 {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();
    }
}
