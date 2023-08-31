package Lessons.Exercise.AbstractClassesInterfaces;

abstract class Vehicle {
    String type;
    int numberOfWheels;

    public Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    public void showVehicleDetails() {
        System.out.println("Type: " + type + "\nNumber Of Wheels: " + numberOfWheels);
    }

    public abstract void doVehicleSound();

}