class Waiter extends RestaurantPerson implements Worker {
    private int tablesAssigned;

    // Constructor
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    // Implementing the performDuties method
    public void performDuties() {
        System.out.println("I am a Waiter. I manage " + tablesAssigned + " tables.");
    }
}