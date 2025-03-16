class Device {
    protected int deviceId;
    protected String status;

    // Constructor to initialize Device attributes
    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}
/*
Device device = new Device(101, "ON");
Thermostat thermostat = new Thermostat(102, "OFF", 22);
device.displayStatus();
thermostat.displayStatus();

Device ID: 101, Status: ON
Device ID: 102, Status: OFF
Temperature Setting: 22°C
 */