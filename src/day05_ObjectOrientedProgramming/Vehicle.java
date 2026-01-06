package day05_ObjectOrientedProgramming;

abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    abstract void start(); // WHAT

    void fuelType() {      // COMMON behavior
        System.out.println("Fuel based vehicle");
    }
}

class Bike extends Vehicle {

    void start() {         // HOW
        System.out.println("Bike starts with kick");
    }

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuelType();
    }
}

//Vehicle constructor
//Bike starts with kick
//Fuel based vehicle