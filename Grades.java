package ajp;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("enter marks: ");
	    int marks = scanner.nextInt();
	    
	    if(marks<50){  
	        System.out.println("F grade");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("E grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("B grade");  
	    }
	    else if(marks>=90 && marks<100){  
	        System.out.println("A grade");  
	    }
	    else{  
	        System.out.println("Invalid!");  
	    }  
	}  

}