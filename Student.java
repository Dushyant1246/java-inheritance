class Student extends Person {
    private int grade;

    // Constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("I am a Student in grade " + grade + ".");
    }
}