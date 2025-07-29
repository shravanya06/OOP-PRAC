package labprgrms;
import java.util.Scanner;

public class sqrroot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the number:");
	        double number = sc.nextDouble();
	        
	        double sqrt = Math.sqrt(number);
	        
	        System.out.println("Square root of " + number + " is: " + sqrt);
	        
	        sc.close(); // optional but good practice
	    }

	}
