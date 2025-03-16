class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
/*
Employee manager = new Manager("Alice", 101, 75000, 5);
Employee developer = new Developer("Bob", 102, 60000, "Java");
Employee intern = new Intern("Charlie", 103, 20000);
manager.displayDetails();
developer.displayDetails();
intern.displayDetails();

ID: 101, Name: Alice, Salary: 75000.0
Team Size: 5
ID: 102, Name: Bob, Salary: 60000.0
Programming Language: Java
ID: 103, Name: Charlie, Salary: 20000.0
 */