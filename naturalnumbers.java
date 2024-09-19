package ajp;
import java.util.Scanner;

public class naturalnumbers {
	public static void main(String[] args) {
		
		int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = scanner.nextInt();
        for(int i=1;i<=num;i++) {
        	sum=sum+i;
        }
        System.out.println("Sum of First Natural Numbers is = " + sum);  

	}
    
}
