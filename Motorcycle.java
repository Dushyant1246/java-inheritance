class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    // Overriding displayInfo method to indicate if it has a sidecar
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}