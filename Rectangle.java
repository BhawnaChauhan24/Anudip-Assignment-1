package ajp;

public class Rectangle {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getters for length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // toString method for displaying rectangle details
    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Width: " + width + "]";
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Display rectangle details
        System.out.println(rectangle);
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.calculatePerimeter());
    }
}
