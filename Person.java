class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
/*
Teacher teacher = new Teacher("Alice", 35, "Mathematics");
Student student = new Student("Bob", 16, 10);
Staff staff = new Staff("Charlie", 40, "Administration");

teacher.displayDetails();
teacher.displayRole();
student.displayDetails();
student.displayRole();
staff.displayDetails();
staff.displayRole();

Name: Alice
Age: 35
I am a Teacher. I teach Mathematics.
Name: Bob
Age: 16
I am a Student in grade 10.
Name: Charlie
Age: 40
I am a Staff member in the Administration department.
 */