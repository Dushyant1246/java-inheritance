class RestaurantPerson {
    protected String name;
    protected int id;

    // Constructor
    public RestaurantPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
/*
Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
Waiter waiter = new Waiter("John", 102, 5);

chef.displayDetails();
chef.performDuties();
waiter.displayDetails();
waiter.performDuties();

Name: Gordon
ID: 101
I am a Chef. My specialty is Italian Cuisine.
Name: John
ID: 102
I am a Waiter. I manage 5 tables.
 */