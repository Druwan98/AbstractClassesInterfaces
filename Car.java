package Lessons.Exercise.AbstractClassesInterfaces;

public class Car extends Vehicle {
    int numberOfDoors;
    double carPrice;

    public Car(String type, int numberOfWheels,int numberOfDoors, double carPrice) {
        super(type, numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice=carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("La macchina ha: " + numberOfDoors + " porte.");
    }

    @Override
    public void doVehicleSound() {
        System.out.println("La macchina fa: *VROOM VROOM*");

    }
}
