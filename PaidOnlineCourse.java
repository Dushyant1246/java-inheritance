class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    // Constructor to initialize PaidOnlineCourse attributes
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overriding displayCourseDetails to include payment details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}