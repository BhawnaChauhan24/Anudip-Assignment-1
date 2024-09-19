package ajp;

//Base class
class Employee {
 private String name;
 private int id;
 private double salary;

 // Constructor
 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getId() {
     return id;
 }

 public double getSalary() {
     return salary;
 }

 // Method to display employee details
 public void displayEmployeeDetails() {
     System.out.println("Employee Details:");
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: $" + salary);
 }
}

//Subclass
class Manager extends Employee {
 private double bonus;

 // Constructor
 public Manager(String name, int id, double salary, double bonus) {
     super(name, id, salary); // Call the superclass (Employee) constructor
     this.bonus = bonus;
 }

 // Method to display manager details
 public void displayManagerDetails() {
     displayEmployeeDetails(); // Call the method from Employee class
     System.out.println("Bonus: $" + bonus);
 }
}

//Main class to test the inheritance
public class Main {
 public static void main(String[] args) {
     // Create an Employee object
     Employee employee = new Employee("Alice", 101, 60000);
     employee.displayEmployeeDetails();

     System.out.println(); // Just for better formatting

     // Create a Manager object
     Manager manager = new Manager("Bob", 102, 80000, 5000);
     manager.displayManagerDetails();
 }
}
