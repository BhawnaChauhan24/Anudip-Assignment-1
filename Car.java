package ajp;

public class Car {
    private String brand;
    private String model;
    private double price;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    // toString method for displaying car details
    @Override
    public String toString() {
        return "Car [Brand: " + brand + ", Model: " + model + ", Price: $" + price + "]";
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Using the default constructor
        Car defaultCar = new Car();
        System.out.println("Default Car: " + defaultCar);

        // Using the parameterized constructor
        Car parameterizedCar = new Car("Toyota", "Camry", 24000.0);
        System.out.println("Parameterized Car: " + parameterizedCar);
    }
}
