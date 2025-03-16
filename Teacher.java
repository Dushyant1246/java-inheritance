class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display role
    public void displayRole() {
        System.out.println("I am a Teacher. I teach " + subject + ".");
    }
}