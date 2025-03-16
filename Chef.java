class Chef extends RestaurantPerson implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implementing the performDuties method
    public void performDuties() {
        System.out.println("I am a Chef. My specialty is " + specialty + ".");
    }
}