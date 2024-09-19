// Java program to check if a number is even or odd
// using Brute Force Approach
package ajp;
// Importing Scanner class to get user input
import java.util.Scanner;

public class EvenOdd {

  public static void main(String[] args) {
    // Creating object of scanner class
    Scanner ab = new Scanner(System.in);

    System.out.print("Enter a number: ");

    // Assign value entered by the user to a variable number
    int number = ab.nextInt();

    if (number % 2 == 0) {
      System.out.println(number + " is even");
    } else {
      System.out.println(number + " is odd");
    }
  }
}
