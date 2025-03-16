class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor to initialize Thermostat attributes
    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method to include temperature setting
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}