package ajp;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number up to which you want the Fibonacci sequence: ");
        int limit = scanner.nextInt();
        
        int a = 0, b = 1;
        
        System.out.println("Fibonacci sequence up to " + limit + ":");
        
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
