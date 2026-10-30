package polymorphism;


class Vehicle {

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

public class Method_Overriding2 {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();

        Bike bike = new Bike();
        bike.start();
    }
}
