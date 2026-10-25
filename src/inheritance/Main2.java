package inheritance;


class Vehicle {

    String brand;
    int speed;

    // Parent constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Common inherited method
    void start() {
        System.out.println(brand + " is starting.");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child class 1
class Car extends Vehicle {

    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void drive() {
        System.out.println("Car is driving.");
        System.out.println("Number of doors: " + doors);
    }
}

// Child class 2
class Bike extends Vehicle {

    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    void ride() {
        System.out.println("Bike is riding.");
        System.out.println("Has gears: " + hasGear);
    }
}

public class Main2 {

    public static void main(String[] args) {

        // Car object
        Car car = new Car("Toyota", 180, 4);

        car.displayInfo();  // Inherited method
        car.start();        // Inherited method
        car.drive();        // Car-specific method

        System.out.println("------------------");

        // Bike object
        Bike bike = new Bike("Yamaha", 120, true);

        bike.displayInfo(); // Inherited method
        bike.start();       // Inherited method
        bike.ride();        // Bike-specific method
    }
}

