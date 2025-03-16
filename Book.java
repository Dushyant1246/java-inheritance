class Book {
    private String title;
    private int publicationYear;

    // Constructor to initialize Book attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title + ", Publication Year: " + publicationYear);
    }
}
/*
Book book = new Book("Java Programming", 2020);
Author author = new Author("Java Programming", 2020, "John Doe", "Expert in Java");
book.displayInfo();
author.displayInfo();

Title: Java Programming, Publication Year: 2020
Title: Java Programming, Publication Year: 2020
Author: John Doe, Bio: Expert in Java
 */