class ElectricVehicle extends HybridVehicle {
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle with battery capacity " + batteryCapacity + " kWh.");
    }
}