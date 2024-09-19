package ajp;

public class Point {
    private int x;
    private int y;

    // Constructor to initialize a point with specific coordinates
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // toString method for displaying point details
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    // Main method to test the Point class
    public static void main(String[] args) {
        // Create a Point object using the parameterized constructor
        Point point1 = new Point(5, 10);
        System.out.println("Original Point: " + point1);

        // Create a Point object using the copy constructor
        Point point2 = new Point(point1);
        System.out.println("Copied Point: " + point2);
        
        // Modifying the original point to show they are separate objects
        System.out.println("Modifying the original point...");
        // Uncomment the next two lines to see that they are independent
        // point1 = new Point(15, 20);  // Create a new point
        // System.out.println("Modified Original Point: " + point1);
    }
}
