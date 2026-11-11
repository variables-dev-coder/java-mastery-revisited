package SOLID_Principles_Intro_level;

// Liskov Substitution Principle (LSP)

// Example 1: Vehicle System

class Vehicle {

    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {

    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {

    public void ride() {
        System.out.println("Bike is riding");
    }
}

public class Main_7 {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        bike.start();
    }
}