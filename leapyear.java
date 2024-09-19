package ajp;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("enter year: ");
	    int year = scanner.nextInt();
	    
	    if (year % 400 == 0) {  //divisible by 400
	        System.out.println(year + " is a leap year.");
	      } 
	      else if (year % 100 == 0) {  //divisible by 100
	        System.out.println(year + " is not a leap year.");
	      } 
	      else if (year % 4 == 0) {  //divisible by 4
	        System.out.println(year + " is a leap year.");
	      } 
	      else {
	        System.out.println(year + " is not a leap year.");
	        }
	    }
}
