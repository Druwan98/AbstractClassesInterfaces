package Lessons.Exercise.AbstractClassesInterfaces;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Alfa Romeo",4,5,25000);
        Boat boat1 = new Boat("Lamborghini",0,100.11,50);

        System.out.println(boat1.getBoatWeightAndSpeed());
        car1.doVehicleSound();
        boat1.doVehicleSound();
        car1.showVehicleDetails();
        boat1.showVehicleDetails();
    }


}
