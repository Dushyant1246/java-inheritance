class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize vehicle attributes
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}
/*
Vehicle car = new Car(180, "Petrol", 5);
Vehicle truck = new Truck(120, "Diesel", 10);
Vehicle motorcycle = new Motorcycle(150, "Petrol", false);
car.displayInfo();
truck.displayInfo();
motorcycle.displayInfo();

Max Speed: 180 km/h, Fuel Type: Petrol
Seat Capacity: 5
Max Speed: 120 km/h, Fuel Type: Diesel
Load Capacity: 10 tons
Max Speed: 150 km/h, Fuel Type: Petrol
Has Sidecar: No
 */