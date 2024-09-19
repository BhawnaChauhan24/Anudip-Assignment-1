package ajp;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		int cnt=0;
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("enter number: ");
	    int number= scanner.nextInt();
	    
	    for(int i=1;i*i<=number;i++) {
	    	if(number%i==0) {
	    		cnt++;
	    		if((number/i)!=i) {
	    			cnt++;
	    		}
	    	}
	    }
	
	if(cnt==0) {
		System.out.print("true");
	}
	else {
		System.out.print("false");
	}
  }

}
