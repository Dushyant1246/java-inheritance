class Course {
    protected String courseName;
    protected int duration; // Duration in weeks

    // Constructor to initialize Course attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}
/*
Course course = new Course("Java Basics", 4);
OnlineCourse onlineCourse = new OnlineCourse("Python for Beginners", 6, "Udemy", true);
PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced AI", 8, "Coursera", false, 299.99, 20);

course.displayCourseDetails();
onlineCourse.displayCourseDetails();
paidOnlineCourse.displayCourseDetails();

Course: Java Basics, Duration: 4 weeks
Course: Python for Beginners, Duration: 6 weeks
Platform: Udemy, Recorded: Yes
Course: Advanced AI, Duration: 8 weeks
Platform: Coursera, Recorded: No
Fee: $299.99, Discount: 20.0%
 */