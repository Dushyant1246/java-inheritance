class HybridVehicle {
    protected int maxSpeed;
    protected String model;

    // Constructor
    public HybridVehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
/*
ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
PetrolVehicle pv = new PetrolVehicle(200, "Ford Mustang", 50);

ev.displayDetails();
ev.charge();
pv.displayDetails();
pv.refuel();

Model: Tesla Model 3
Max Speed: 150 km/h
Charging the electric vehicle with battery capacity 75 kWh.
Model: Ford Mustang
Max Speed: 200 km/h
Refueling the petrol vehicle with fuel capacity 50 liters.
 */