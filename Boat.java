package Lessons.Exercise.AbstractClassesInterfaces;

public class Boat extends Vehicle {
    double maxKnotsSpeed;
    int boatKilosWeight;

    public Boat(String type, int numberOfWheels,double maxKnotsSpeed, int boatKilosWeight) {
        super(type, numberOfWheels);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("VRUUUUUUUU");
    }

    public String getBoatWeightAndSpeed() {
        return "Velocità massima dei nodi: " + maxKnotsSpeed + ", Peso totale dei Kg: " + boatKilosWeight;
    }

}
