class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("I am a Staff member in the " + department + " department.");
    }
}