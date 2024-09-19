package ajp;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with just the title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Constructor with all attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // toString method for displaying book details
    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", Price: $" + price + "]";
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating Book objects using different constructors
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);

        // Displaying the details of each book
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
