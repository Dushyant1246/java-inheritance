class PetrolVehicle extends HybridVehicle implements Refuelable {
    private int fuelCapacity;

    // Constructor
    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    // Implementing the refuel method
    public void refuel() {
        System.out.println("Refueling the petrol vehicle with fuel capacity " + fuelCapacity + " liters.");
    }
}