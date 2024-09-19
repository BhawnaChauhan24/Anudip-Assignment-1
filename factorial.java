package ajp;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            int i = 1;
            
            while (i <= number) {
                factorial *= i;
                i++;
            }
            
            System.out.println("Factorial of " + number + " is " + factorial);
        }
        
        scanner.close();
    }
}
