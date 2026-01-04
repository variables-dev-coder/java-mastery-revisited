package day04_ObjectOrientedProgramming;


abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();  // Bike started
    }
}